package com.egen.project_ex.service;

import com.egen.project_ex.model.Order;

import java.util.Optional;

public interface InternalService {
    Order createOrder(Order order);
    Optional<Order> getOrderByID(String id);
    boolean cancelOrder(String id);
}
