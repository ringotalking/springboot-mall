package com.ringo.springbootmall.dao;

import com.ringo.springbootmall.dto.ProductRequest;
import com.ringo.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
