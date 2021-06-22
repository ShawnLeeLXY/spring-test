package com.lxy.util;

import com.lxy.controller.TransactionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * AOP测试：JDK动态代理
 * 获取代理对象的工具类
 * 增强功能：事务管理
 */
@Component
public class DynamicProxyUtil {

    @Autowired
    private TransactionHandler th;

    public <T> T getProxyObject(Class<T> cls) {
        Object proxyObj = Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                Object res = null;
                try {
                    th.begin();
                    res = method.invoke(cls.newInstance(), args);
                    th.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                    th.rollback();
                } finally {
                    th.closeSession();
                }
                return res;
            }
        });
        return (T) proxyObj;
    }

}
