/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.productservice.security;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 5:08 PM
 */

public class Endpoints {
    public static final String[] PUBLIC_GET_ENDPOINS = {
            "products",
            "products/**",
    };

    public static final String[] ADMIN_POST_ENDPOINS = {
            "products",
            "products/**",
    };

    public static final String[] ADMIN_DELETE_ENDPOINS = {
            "products",
            "products/**",
    };

}
