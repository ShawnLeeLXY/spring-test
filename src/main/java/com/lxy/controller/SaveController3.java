package com.lxy.controller;

import com.lxy.service.SaveService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Autowired注入方式三：构造器注入
 */
@Controller
public class SaveController3 {

    private SaveService saveService;

    public SaveController3(@Qualifier("service") SaveService saveService) {
        this.saveService = saveService;
        System.out.println("SaveController3构造器被执行了");
    }

    public void save() {
        saveService.save();
    }

}
