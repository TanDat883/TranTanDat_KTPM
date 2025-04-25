/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.productservice.service;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 6:00 PM
 */

import com.backend.productservice.entities.Product;

import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public Product findById(Long id);
    public List<Product> findAll();
    public void deleteById(Long id);
    public Product update(Product product);
}
