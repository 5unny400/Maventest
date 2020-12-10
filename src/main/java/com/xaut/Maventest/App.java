package com.xaut.Maventest;

import com.xaut.Maventest.bean.Person;
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
        System.out.println( "Hello World!" );
        //创建IOC容器对象context
        ApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");
        //从容器中获取对象（通过id）
        Person person = (Person) context.getBean("user");

        System.out.println(person);
    }
}
