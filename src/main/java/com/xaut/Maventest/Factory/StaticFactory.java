package com.xaut.Maventest.Factory;

import com.xaut.Maventest.bean.Person;

public class StaticFactory {
    //静态方法获取对象
    public static Person getPerson(){
        //获取Person对象
        return new Person();
    }

    public static void main(String[] args) {
        //通过静态方法获取person对象
        Person p = getPerson();
    }

}
