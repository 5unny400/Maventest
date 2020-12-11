package com.xaut.Maventest.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component(value = "user")
public class User {
    //可直接注入
    @Value("2")
    private Integer id;
    private String name;
    private String passwd;
    private String address;
    private Person person;
    private List<String> ls;
    private Map<String,String> ms;

    public void setMs(Map<String, String> ms) {
        this.ms = ms;
    }

    public Map<String, String> getMs() {
        return ms;
    }

    public void setLs(List<String> ls) {
        this.ls = ls;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", address='" + address + '\'' +
                ", person=" + person +
                ", ls=" + ls +
                ", ms=" + ms +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, String passwd, String address) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getAddress() {
        return address;
    }


}
