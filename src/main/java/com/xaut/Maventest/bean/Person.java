package com.xaut.Maventest.bean;

public class Person {
    private String name;
    private int id;

    public Person() {
        System.out.println("无参构造："+this.toString());
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("有参构造："+this.toString());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[name:"+this.name+","+"id:"+this.id+"]";
    }
}
