package com.ringo.springbootmall.dao;

import com.ringo.springbootmall.dto.OrderQueryParams;
import com.ringo.springbootmall.model.Order;
import com.ringo.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    List<Order>getOrders(OrderQueryParams orderQueryParams);
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, Integer totalAmount);
    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
