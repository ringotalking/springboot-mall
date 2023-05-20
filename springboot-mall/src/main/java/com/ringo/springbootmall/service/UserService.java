package com.ringo.springbootmall.service;

import com.ringo.springbootmall.dto.UserRegisterRequest;
import com.ringo.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

}
