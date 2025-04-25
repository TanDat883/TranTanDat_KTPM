/*
 * @(#) $(NAME).java    1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package com.backend.orderservice.services;

/*
 * @description
 * @author: Tran Tan Dat
 * @version: 1.0
 * @created: 25-April-2025 6:59 PM
 */

import com.backend.orderservice.entities.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);

    Order getOrderById(Long id);

    List<Order> getAllOrders();

    Order updateOrder(Long id, Order order);

    void deleteOrder(Long id);
}
