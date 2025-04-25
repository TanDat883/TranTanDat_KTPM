/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.authservice.services;


import com.backend.authservice.dtos.SignInRequest;
import com.backend.authservice.dtos.SignUpRequest;
import com.backend.authservice.entities.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 3:37 PM
 */
public interface AccountService extends UserDetailsService {
    public ResponseEntity<?> signUp(SignUpRequest account);
    public ResponseEntity<?> signIn(SignInRequest account, AuthenticationManager authenticationManager);
    public Account findByUsername(String username);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

    