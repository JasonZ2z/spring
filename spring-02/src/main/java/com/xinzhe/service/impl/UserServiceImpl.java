package com.xinzhe.service.impl;

import com.xinzhe.pojo.User;
import com.xinzhe.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author xzheng
 * @create 2021/5/4
 */
public class UserServiceImpl implements UserService, ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void register(User user) {
        System.out.println("******************* UserServiceImpl # register()");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.login("zx", "123");
    }

    @Override
    public boolean login(String name, String password) {
        System.out.println("******************* UserServiceImpl # login()");
        return true;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}

