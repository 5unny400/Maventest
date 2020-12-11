package com.xaut.Maventest.service;

import com.xaut.Maventest.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
//service注解是装配bean
public class UserService {
    @Autowired
    //Aotowired是用来注入依赖的
    private MailService mailService;

    public void setMailService(MailService mailService){
        this.mailService = mailService;
    }

    private List<User> userList = new ArrayList<User>();

    public User login(String name,String passwd){
        for(User user:userList){
            if(user.getName().equalsIgnoreCase(name)&&user.getPasswd().equalsIgnoreCase(passwd)){
                mailService.sendLoginMsg(user);
                return  user;
            }
        }
        throw new RuntimeException("login failed!");
    }

    public User getUser(long id){
        for(User user:userList){
            if(user.getId() == id){
                return user;
            }
        }
        return  null;
    }

    public User register(String name,String passwd,String address){
        User user = new User(userList.size()+1,name,passwd,address);
        userList.add(user);
        mailService.sendRegisterMsg(user);
        return  user;

    }
}
