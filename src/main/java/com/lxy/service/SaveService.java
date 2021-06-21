package com.lxy.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用注解配置时，需要将Spring框架启动就创建对象的类表示为组件类
 * 表示组件类使用@Component注解
 */
@Component("service")
@Scope("singleton")
public class SaveService {

    public void save() {
        System.out.println("成功保存数据！");
    }

    @PostConstruct
    public void init() {
        System.out.println("SaveService initing...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SaveService destroying..");
    }

}
