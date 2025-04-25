/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.authservice.security;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 3:59 PM
 */

import com.backend.authservice.filters.JWTFilter;
import com.backend.authservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Arrays;

@Configuration
public class SecurityConfiguration {
    @Autowired
    @Lazy
    private JWTFilter jwtFilter;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    DaoAuthenticationProvider authenticationProvider(@Autowired AccountService accountService) {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(accountService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .cors(cors -> cors.configurationSource(request -> {
                    CorsConfiguration corsConfig = new CorsConfiguration();
                    corsConfig.addAllowedOrigin("*");
                    corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
                    corsConfig.addAllowedHeader("*");
                    return corsConfig;
                }))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.GET, Endpoints.PUBLIC_GET_ENDPOINS).permitAll()
                        .requestMatchers(HttpMethod.POST, Endpoints.PUBLIC_POST_ENDPOINS).permitAll()
                        .requestMatchers(HttpMethod.GET, Endpoints.ADMIN_GET_ENDPOINS).hasAuthority("ADMIN")
                )
                .httpBasic(Customizer.withDefaults())
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

}
