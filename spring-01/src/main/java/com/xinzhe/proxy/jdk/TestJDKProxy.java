package com.xinzhe.proxy.jdk;

import com.xinzhe.service.UserService;
import com.xinzhe.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xzheng
 * @create 2021/5/4
 */
public class TestJDKProxy {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("TestJDKProxy ------ before --- log");
                Object invoke = method.invoke(userService, args);
                System.out.println("TestJDKProxy ------ after --- log");
                return invoke;
            }
        };

        UserService proxyInstance = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                invocationHandler);

        proxyInstance.login("zx", "12");

    }
}
