package com.xaut.Maventest;

import com.xaut.Maventest.bean.Person;
import com.xaut.Maventest.bean.User;
import com.xaut.Maventest.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* //创建IOC容器对象context，涉及到反射，
        ApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        //从容器中获取对象（通过id）
        Person person = (Person) context.getBean("person");

        System.out.println(person);*/


        ApplicationContext context1 = new ClassPathXmlApplicationContext("application2.xml");
        UserService userService = (UserService)context1.getBean("userService");
        userService.register("lisi","123456","xaut");
        //        System.out.println(user);
    }
}
