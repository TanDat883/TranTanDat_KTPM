/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.customerservice.dtos;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 4:37 PM
 */

import lombok.Data;

@Data
public class ApiResponseDTO<T> {
    int code;
    String message;
    T data;
    T errors;

}
