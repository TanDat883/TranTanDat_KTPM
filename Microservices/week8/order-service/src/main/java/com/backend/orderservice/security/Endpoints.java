/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.orderservice.security;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 5:08 PM
 */

public class Endpoints {
    public static final String[] ADMIN_GET_ENDPOINS = {
            "orders",
            "orders/**",
    };

    public static final String[] PUBLIC_POST_ENDPOINS = {
            "orders",
            "orders/**",
    };

    public static final String[] ADMIN_DELETE_ENDPOINS = {
            "orders",
            "orders/**",
    };

}
