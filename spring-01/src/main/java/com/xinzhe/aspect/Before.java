package com.xinzhe.aspect;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author xzheng
 * @create 2021/5/3
 */
public class Before implements MethodBeforeAdvice {
    /**
     *
     * @param method        原始方法   login
     * @param objects       原始方法的参数
     * @param o             原始对象   userService
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("----------------Method before advice log-----------------");
        System.out.println(method.getName());
    }
}
