package com.lxy.dao.impl;

import com.lxy.dao.RegistDao;
import com.lxy.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class RegistDaoImpl implements RegistDao {

    @Override
    public void register(User user) {
        System.out.println("注册功能Dao层方法执行了");
    }

}
