package com.ringo.springbootmall.service;

import com.ringo.springbootmall.dto.CreateOrderRequest;
import com.ringo.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
