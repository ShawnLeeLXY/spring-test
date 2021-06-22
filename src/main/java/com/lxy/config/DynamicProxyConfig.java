package com.lxy.config;

import com.lxy.controller.TransactionHandler;
import com.lxy.util.DynamicProxyUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AOP测试：JDK动态代理
 */
@Configuration
public class DynamicProxyConfig {

    @Bean(name = "th")
    public TransactionHandler getTransactionHandler() {
        return new TransactionHandler();
    }

    @Bean(name = "dynamicProxyUtil")
    public DynamicProxyUtil getDynamicProxyUtil() {
        return new DynamicProxyUtil();
    }

}
