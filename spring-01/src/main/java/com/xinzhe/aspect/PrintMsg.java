package com.xinzhe.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintMsg {

    @Before("execution(* *(..))")
    public void addMsg(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName());
        System.out.println("---------------");
    }
}