/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.customerservice.security;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 5:08 PM
 */

public class Endpoints {
    public static final String[] PUBLIC_GET_ENDPOINS = {
    };

    public static final String[] PUBLIC_POST_ENDPOINS = {
            "users/create"
    };

    public static final String[] PUBLIC_PUT_ENDPOINS = {
            "users/{id}",
    };

    public static final String[] ADMIN_GET_ENDPOINS = {
            "users",
            "users/**",
    };

    public static final String[] ADMIN_POST_ENDPOINS = {
            "users",
    };

    public static final String[] USER_GET_ENDPOINTS = {
            "users/{id}"
    };

}
