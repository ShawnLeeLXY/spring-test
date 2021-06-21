package com.lxy.controller;

import com.lxy.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Autowired注入方式二：setter方法注入
 */
@Controller
public class SaveController2 {

    private SaveService saveService;

    @Autowired
    public void setSaveService(SaveService saveService) {
        this.saveService = saveService;
        System.out.println("setSavaService被执行了");
    }

    public void save() {
        saveService.save();
    }

}
