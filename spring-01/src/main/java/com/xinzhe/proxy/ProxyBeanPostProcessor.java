package com.xinzhe.proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @author xzheng
 * @create 2021/5/4
 */
public class ProxyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("TestJDKProxy ------ before --- log");
                    Object invoke = method.invoke(bean, args);
                    System.out.println("TestJDKProxy ------ after --- log");
                    return invoke;
                });

    }
}
