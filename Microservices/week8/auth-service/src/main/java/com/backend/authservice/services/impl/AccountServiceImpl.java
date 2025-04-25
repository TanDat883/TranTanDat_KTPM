/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.authservice.services.impl;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 3:40 PM
 */

import com.backend.authservice.dtos.CreateUserRequest;
import com.backend.authservice.dtos.JwtResponse;
import com.backend.authservice.dtos.SignInRequest;
import com.backend.authservice.dtos.SignUpRequest;
import com.backend.authservice.entities.Account;
import com.backend.authservice.entities.Role;
import com.backend.authservice.repositories.AccountRepository;
import com.backend.authservice.repositories.RoleRepository;
import com.backend.authservice.services.AccountService;
import com.backend.authservice.utils.JWTUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    @Lazy
    private JWTUtil jwtService;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public ResponseEntity<?> signUp(SignUpRequest signUpRequest) {
        if (accountRepository.existsAccountByUsername(signUpRequest.getUsername())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username is already taken!");
        }
        if (accountRepository.existsAccountByEmail(signUpRequest.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email is already taken!");
        }

        String encryptPassword = passwordEncoder.encode(signUpRequest.getPassword());
        signUpRequest.setPassword(encryptPassword);

        Account account = modelMapper.map(signUpRequest, Account.class);

        Role userRole = roleRepository.findRoleByName("USER");

        // Gán quyền USER cho tài khoản mới
        account.setRoles(Collections.singletonList(userRole));

        Account savedAccount = accountRepository.save(account); // lưu trước để có ID

        // Gọi user-service để tạo user trống
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserId(savedAccount.getAccountId()); // dùng ID của account
        createUserRequest.setUsername(savedAccount.getUsername());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CreateUserRequest> request = new HttpEntity<>(createUserRequest, headers);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    "http://localhost:8080/users/create", // Gọi qua API Gateway
                    request,
                    String.class
            );

            if (response.getStatusCode() != HttpStatus.CREATED) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Account created, but failed to create user profile.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Account created, but error calling user-service.");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("Account created successfully!");
    }
    @Override
    public ResponseEntity<?> signIn(SignInRequest signInRequest, AuthenticationManager authenticationManager) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword()));
            if (authentication.isAuthenticated()) {
                final String token = jwtService.generateToken(signInRequest.getUsername());
                return ResponseEntity.ok(new JwtResponse(token));
            }
        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Tên đăng nhập hoặc mật khẩu không chính xác.");
        }
        return ResponseEntity.badRequest().body("Xác thực không thành công.");
    }

    @Override
    public Account findByUsername(String username) {
        return accountRepository.findAccountByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findAccountByUsername(username);
        if (username==null){
            throw new UsernameNotFoundException("Account not found");
        }
        return new User(account.getUsername(), account.getPassword(), rolesToAuthorities(account.getRoles()));
    }
    private Collection<? extends GrantedAuthority> rolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

}
