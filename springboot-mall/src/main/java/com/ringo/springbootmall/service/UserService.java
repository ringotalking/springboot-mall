package com.ringo.springbootmall.service;

import com.ringo.springbootmall.dto.UserLoginRequest;
import com.ringo.springbootmall.dto.UserRegisterRequest;
import com.ringo.springbootmall.model.User;

public interface UserService {
    User login(UserLoginRequest userLoginRequest);

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

}
