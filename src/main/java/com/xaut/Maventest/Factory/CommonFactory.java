package com.xaut.Maventest.Factory;

import com.xaut.Maventest.bean.Person;

public class CommonFactory {

    public Person getPerson(){
        return new Person();
    }

    public static void main(String[] args) {
        //先实现
        CommonFactory commonFactory = new CommonFactory();
        Person person = commonFactory.getPerson();
    }


}
