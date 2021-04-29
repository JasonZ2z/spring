package com.xinzhe.pojo;

public class User {

    private Integer id;
    private String name;

    public User() {
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

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}