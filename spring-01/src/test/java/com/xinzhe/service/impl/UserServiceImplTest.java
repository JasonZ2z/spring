package com.xinzhe.service.impl;

import com.xinzhe.pojo.User;
import com.xinzhe.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.login("zx", "123");
        userService.register(new User());
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = context.getBean("userServiceAnnotation", UserService.class);
        userService.login("zx", "123");
        userService.register(new User());
    }


    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.login("zx", "123");
        userService.register(new User());
    }



}