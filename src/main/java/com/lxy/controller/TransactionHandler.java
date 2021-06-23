package com.lxy.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面类
 */
@Component
@Aspect
public class TransactionHandler {

    @Pointcut("execution(* com.lxy.service..*.*(..))")
    public void pointcut() {
    }

    // 前置增强
    @Before("pointcut()")
    public void begin() {
        System.out.println("开启事务");
    }

    // 后置增强
    @AfterReturning("pointcut()")
    public void commit() {
        System.out.println("提交事务");
    }

    // 异常增强
    @AfterThrowing("pointcut()")
    public void rollback() {
        System.out.println("回滚事务");
    }

    // 最终增强
    @After("pointcut()")
    public void closeSession() {
        System.out.println("关闭session");
    }

    // 环绕增强
    @Around("pointcut()")
    public void allInOne(ProceedingJoinPoint pjp) {
        try {
            begin();
            pjp.proceed();//执行被调用的方法
            commit();
        } catch (Throwable e) {
            e.printStackTrace();
            rollback();
        } finally {
            closeSession();
        }
    }

}
