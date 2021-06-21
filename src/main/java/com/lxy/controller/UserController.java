package com.lxy.controller;

import com.lxy.entity.User;
import com.lxy.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void insert() {
        System.out.println("注册功能Controller层方法执行了！");
        User user = new User();
        userService.insert(user);
    }

}
