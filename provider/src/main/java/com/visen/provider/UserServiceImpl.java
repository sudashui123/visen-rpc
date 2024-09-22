package com.visen.provider;

import com.visen.common.model.User;
import com.visen.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名： " + user.getName());
        return user;
    }
}
