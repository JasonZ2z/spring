package com.xinzhe.proxy.cglib;

import com.xinzhe.service.UserService;
import com.xinzhe.service.impl.UserServiceProxy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xzheng
 * @create 2021/5/4
 */
public class TestCglibProxy {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();


        MethodInterceptor interceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("TestJDKProxy ------ before --- log");
                Object invoke = method.invoke(userServiceProxy, args);
                System.out.println("TestJDKProxy ------ after --- log");
                return invoke;
            }
        };

        UserService userService = (UserService) Enhancer.create(
                UserServiceProxy.class,
                null,
                interceptor
        );

        userService.login("zx", "1223");
    }
}
