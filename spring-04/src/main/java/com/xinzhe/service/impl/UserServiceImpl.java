package com.xinzhe.service.impl;

import com.xinzhe.dao.UserDAO;
import com.xinzhe.pojo.User;
import com.xinzhe.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author xzheng
 * @create 2021/5/4
 */

@Service
public class UserServiceImpl implements UserService, ApplicationContextAware {

    private ApplicationContext ctx;

    @Autowired
    private UserDAO userDAO;

    @Override
    public void register(User user) {
        userDAO.save(user);
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

