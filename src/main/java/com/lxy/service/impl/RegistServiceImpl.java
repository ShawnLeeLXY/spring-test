package com.lxy.service.impl;

import com.lxy.dao.RegistDao;
import com.lxy.entity.User;
import com.lxy.service.RegistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegistServiceImpl implements RegistService {

    @Resource(name = "registDaoImpl")
    private RegistDao registDao;

    @Override
    public void register(User user) {
        System.out.println("注册功能Service层方法开始执行...");
        registDao.register(user);
        System.out.println("Service层方法执行完毕");
    }

}
