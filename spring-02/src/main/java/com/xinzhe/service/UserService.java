package com.xinzhe.service;

import com.xinzhe.pojo.User;

public interface UserService {

    public void register(User user);

    public boolean login(String name, String password);
}