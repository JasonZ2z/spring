package com.xinzhe.pojo;

public class Person {

    private Integer id;
    private String name;

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
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}