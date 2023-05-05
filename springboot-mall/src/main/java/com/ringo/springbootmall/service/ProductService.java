package com.ringo.springbootmall.service;

import com.ringo.springbootmall.dto.ProductRequest;
import com.ringo.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
}
