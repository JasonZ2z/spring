package com.xinzhe.pojo;

import org.springframework.beans.factory.InitializingBean;

import java.util.Date;

public class Person implements InitializingBean {

    private Integer id;
    private String name;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private Date birthday;

    public Person() {
        System.out.println("********** Construct Method " + this.getClass().getSimpleName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("********** Set Method " + this.getClass().getSimpleName() + " setId");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", birthday=" + birthday + '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person init method");
    }

    public void myInitMethod() {
        System.out.println("my person init method");
    }
}