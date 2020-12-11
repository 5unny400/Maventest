package com.xaut.Maventest.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
//等同于      <bean id="person" class="com.xaut.Maventest.bean.Person">
//默认名字是类名首字母小写
public class Person {
    @Value("value注解赋值name")
    private String name;
    @Value("22")
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
