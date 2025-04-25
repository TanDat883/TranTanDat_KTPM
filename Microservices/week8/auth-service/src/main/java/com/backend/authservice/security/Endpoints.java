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
 * @created: 25-April-2025 4:00 PM
 */

public class Endpoints {
    public static final String[] PUBLIC_GET_ENDPOINS = {
            "/accounts/search/existsByTenDangNhap",
            "/accounts/search/existsByEmail",
    };

    public static final String[] PUBLIC_POST_ENDPOINS = {
            "/accounts/sign-up",
            "/accounts/sign-in",
    };

    public static final String[] ADMIN_GET_ENDPOINS = {
            "/accounts",
            "/accounts/**",
    };

}
