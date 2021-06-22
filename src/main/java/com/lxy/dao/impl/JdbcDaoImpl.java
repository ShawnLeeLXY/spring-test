package com.lxy.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcDaoImpl {

    /**
     * @Value(value="")
     * 可以从Spring容器读取 .properties 配置文件内容
     * value ：配置文件的对应的key -->使用 ${key} 获取
     * 程序运行中自动将 properties的key对应的value值获取出来设置给字段
     */
    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.maxActive}")
    private String maxActive;

    public void testValue() {
        System.out.println("driverClassName：" + driverClassName);
        System.out.println("url：" + url);
        System.out.println("username：" + username);
        System.out.println("password：" + password);
        System.out.println("maxActive：" + maxActive);
    }

}
