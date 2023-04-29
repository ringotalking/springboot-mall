package com.ringo.springbootmall.dao;

import com.ringo.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
