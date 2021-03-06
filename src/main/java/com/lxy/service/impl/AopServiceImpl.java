package com.lxy.service.impl;

import com.lxy.service.AopService;
import org.springframework.stereotype.Service;

/**
 * AOP测试：动态代理
 */
@Service
public class AopServiceImpl implements AopService {

    @Override
    public void insert() {
        System.out.println("AOP：service层的insert方法执行了");
    }

    @Override
    public void update() {
        System.out.println("AOP：service层的update方法执行了");
    }

}
