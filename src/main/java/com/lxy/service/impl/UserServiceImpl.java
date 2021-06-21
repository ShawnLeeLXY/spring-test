package com.lxy.service.impl;

import com.lxy.dao.UserDao;
import com.lxy.entity.User;
import com.lxy.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert(User user) {
        System.out.println("注册功能Service层方法执行了！");
        userDao.insert(user);
    }

}
