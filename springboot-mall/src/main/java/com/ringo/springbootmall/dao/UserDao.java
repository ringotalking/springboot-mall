package com.ringo.springbootmall.dao;

import com.ringo.springbootmall.dto.UserRegisterRequest;
import com.ringo.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
