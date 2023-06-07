package com.ringo.springbootmall.service;

import com.ringo.springbootmall.dto.CreateOrderRequest;
import com.ringo.springbootmall.dto.OrderQueryParams;
import com.ringo.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer countOrder(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
