package com.xinzhe.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class PersonTest {

    @Test
    public void test01(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("person", Person.class));

        System.out.println(applicationContext.getId());

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        for (String s : applicationContext.getBeanNamesForType(Person.class)) {
            System.out.println(s);
        }
        System.out.println(applicationContext.containsBean("person"));
        System.out.println(applicationContext.containsBean("person1"));
        System.out.println(applicationContext.containsBeanDefinition("person"));
        System.out.println(applicationContext.containsBeanDefinition("person1"));
    }


    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("p"));

        System.out.println(applicationContext.containsBean("p"));
        System.out.println(applicationContext.containsBean("person1"));
        System.out.println(applicationContext.containsBeanDefinition("person1"));
        System.out.println(applicationContext.containsBeanDefinition("p1"));
    }

    @Test
    public void test04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("person", Person.class));
    }

    @Test
    public void test05(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection conn = applicationContext.getBean("conn", Connection.class);
        try {
            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println(metaData.getURL());
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getUserName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    public void test06(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("&conn"));
    }

    @Test
    public void test07(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("conn2"));
    }
}