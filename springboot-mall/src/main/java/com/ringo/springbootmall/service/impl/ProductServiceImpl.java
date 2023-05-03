package com.ringo.springbootmall.service.impl;

import com.ringo.springbootmall.dao.ProductDao;
import com.ringo.springbootmall.service.ProductService;
import com.ringo.springbootmall.dto.ProductRequest;
import com.ringo.springbootmall.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
