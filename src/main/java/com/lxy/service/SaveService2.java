package com.lxy.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("service2")
@Scope("prototype")
public class SaveService2 {

    public void save() {
        System.out.println("成功保存数据！");
    }

}
