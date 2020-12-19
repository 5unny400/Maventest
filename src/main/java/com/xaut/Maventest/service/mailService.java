package com.xaut.Maventest.service;

import com.xaut.Maventest.bean.User;
import org.springframework.stereotype.Service;

@Service(value = "mailService")
//service注解是装配bean
public class mailService {

    public void sendLoginMsg(User user){
        System.out.println(String.format("Hi ,%s",user.getName()));
    }

    public void sendRegisterMsg(User user){
        System.out.printf("Welcome ,%s!",user.getName());
    }
}
