package com.lxy.config;

import com.lxy.controller.TransactionHandler;
import com.lxy.util.CglibProxyUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AOP测试：CGLIB动态代理
 */
@Configuration
public class CglibProxyConfig {

    @Bean(name = "th")
    public TransactionHandler getTransactionHandler() {
        return new TransactionHandler();
    }

    @Bean(name = "cglibProxyUtil")
    public CglibProxyUtil getCglibProxyUtil() {
        return new CglibProxyUtil();
    }

}
