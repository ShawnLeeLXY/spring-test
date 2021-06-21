package com.lxy.dao.impl;

import com.lxy.dao.UserDao;
import com.lxy.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void insert(User user) {
        System.out.println("注册功能Dao层方法执行了！");
    }

}
