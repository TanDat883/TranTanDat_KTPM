/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.customerservice.services;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 4:16 PM
 */

import com.backend.customerservice.dtos.CreateUserRequest;
import com.backend.customerservice.dtos.UserDTO;

import java.util.List;

public interface UserService {
    public UserDTO findById(Long id);

    public List<UserDTO> findAll();

    public UserDTO save(UserDTO nguoiDung);

    public boolean delete(Long id);

    public CreateUserRequest createUserRequest(CreateUserRequest request);

}
