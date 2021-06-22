package com.lxy.util;

import com.lxy.controller.TransactionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * AOP测试：CGLIB动态代理
 * 获取代理对象的工具类
 * 增强功能：事务管理
 */
@Component
public class CglibProxyUtil {

    @Autowired
    private TransactionHandler th;

    public <T> T getProxyObject(Class<T> cls) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(cls.getClassLoader());
        enhancer.setSuperclass(cls);
        enhancer.setCallback(new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) {
                Object res = null;
                try {
                    th.begin();
                    res = method.invoke(cls.newInstance(), objects);
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
        Object proxyObj = enhancer.create();
        return (T) proxyObj;
    }

}
