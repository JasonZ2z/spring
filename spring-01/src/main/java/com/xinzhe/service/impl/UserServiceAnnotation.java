package com.xinzhe.service.impl;

import com.xinzhe.annotation.Log;
import com.xinzhe.pojo.User;
import com.xinzhe.service.UserService;

/**
 * @author xzheng
 * @create 2021/4/29
 */
public class UserServiceAnnotation implements UserService {


    @Override
    @Log
    public void register(User user) {
        System.out.println("******************* UserServiceImpl # register()");
    }

    @Override
    public boolean login(String name, String password) {
        System.out.println("******************* UserServiceImpl # login()");
        return true;
    }
}
