package com.xinzhe.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author xzheng
 * @create 2021/5/3
 */
public class Around implements MethodInterceptor {
    /**
     *
     * @param methodInvocation  原始方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("----------------Method before advice log-----------------");
        Object proceed = methodInvocation.proceed();
        System.out.println("----------------Method after advice log-----------------");
        return proceed;
    }
}
