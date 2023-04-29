package com.ringo.springbootmall.dao.service.impl;

import com.ringo.springbootmall.dao.ProductDao;
import com.ringo.springbootmall.dao.service.ProductService;
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
}
