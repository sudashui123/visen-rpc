package com.visen.consumer;

import com.visen.common.model.User;
import com.visen.common.service.UserService;
import com.visen.proxy.ServiceProxyFactory;


public class ConsumerExample {
    public static void main(String[] args) {

        //获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("visen");

        //调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
        long number = userService.getNumber();
        System.out.println(number);
    }
}
