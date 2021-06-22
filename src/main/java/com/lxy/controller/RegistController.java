package com.lxy.controller;

import com.lxy.entity.User;
import com.lxy.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class RegistController {

    @Autowired
    @Qualifier("registServiceImpl")
    private RegistService registService;

    public void register() {
        System.out.println("注册功能Controller层方法开始执行...");
        User user = new User();
        registService.register(user);
        System.out.println("Controller层方法执行完毕");
    }

}
