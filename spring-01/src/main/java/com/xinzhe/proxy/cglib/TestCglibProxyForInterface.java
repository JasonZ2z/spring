package com.xinzhe.proxy.cglib;

import com.xinzhe.service.UserService;
import com.xinzhe.service.impl.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xzheng
 * @create 2021/5/4
 */
public class TestCglibProxyForInterface {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        MethodInterceptor interceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("TestJDKProxy ------ before --- log");
                Object invoke = method.invoke(userService, args);
                System.out.println("TestJDKProxy ------ after --- log");
                return invoke;
            }
        };

        UserService proxy = (UserService) Enhancer.create(
                userService.getClass(),
                userService.getClass().getInterfaces(),
                interceptor
        );

        proxy.login("zx", "1223");
    }
}
