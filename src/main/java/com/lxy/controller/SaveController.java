package com.lxy.controller;

import com.lxy.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Autowired注入方式一：字段注入
 */
@Controller
public class SaveController {

    // 反射字段直接注入：Field.set(obj, value);
    @Autowired
    //@Qualifier("service")
    private SaveService saveService;

    public void save() {
        saveService.save();
    }

}
