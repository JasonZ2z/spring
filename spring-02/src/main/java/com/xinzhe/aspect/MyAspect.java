package com.xinzhe.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author xzheng
 * @create 2021/5/4
 */

@Aspect
public class MyAspect {

    @Pointcut("execution(* *..UserServiceImpl.*(..))")
    public void myPointCut(){}

    @Around("myPointCut()")
    public Object Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("----------------Aspect log1----------------");
        return joinPoint.proceed();
    }

    @Around("myPointCut()")
    public Object Around1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("----------------Aspect log2----------------");
        return joinPoint.proceed();
    }
}
