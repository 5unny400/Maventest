package com.xaut.Maventest.service;

import org.aspectj.lang.ProceedingJoinPoint;

//增强类
public class logService {

    //前置增强
    public void before(){
        System.out.println("前置增强！");
    }

    //后置增强
    public void after(){
        System.out.println("后置增强！");
    }

    //环绕通知
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知之后！");
        //被指定的增强的方法
        joinPoint.proceed();
        System.out.println("环绕通知之后！");
    }

}
