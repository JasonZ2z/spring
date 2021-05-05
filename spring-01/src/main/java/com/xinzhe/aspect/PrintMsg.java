package com.xinzhe.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintMsg {

    @Before("execution(* *(..))")
    public void addMsg(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
    }
}