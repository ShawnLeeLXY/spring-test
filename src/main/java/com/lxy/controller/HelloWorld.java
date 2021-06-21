package com.lxy.controller;

public class HelloWorld {

    private String name;

    public void hello() {
        System.out.println("Hello, " + name + "!");
    }

    public String getName() {
        return name;
    }

    // 依赖注入
    public void setName(String name) {
        this.name = name;
    }

}
