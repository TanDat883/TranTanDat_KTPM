/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.authservice.dtos;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 3:50 PM
 */

import lombok.Data;

@Data
public class JwtResponse {
    private final String token;

    public JwtResponse(String token) {
        this.token = token;
    }
}

