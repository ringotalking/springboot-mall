package com.ringo.springbootmall.service;

import com.ringo.springbootmall.constant.ProductCategory;
import com.ringo.springbootmall.dto.ProductRequest;
import com.ringo.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);

}
