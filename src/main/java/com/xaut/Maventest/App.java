package com.xaut.Maventest;

import com.xaut.Maventest.service.userService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       /* //创建IOC容器对象context，涉及到反射，
        ApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        //从容器中获取对象（通过id）
        Person person = (Person) context.getBean("person");
        System.out.println(person);*/

//        ApplicationContext context1 = new ClassPathXmlApplicationContext("application2.xml");
//        userService userService = (com.xaut.Maventest.service.userService) context1.getBean("userService");
//        userService.register("lisi", "123456", "xaut");
        //        System.out.println(user);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("application3.xml");
        com.xaut.Maventest.service.userService increase = (com.xaut.Maventest.service.userService) context2.getBean(
                "userService");
        increase.register("hangman", "13456", "taut");
    }
}
