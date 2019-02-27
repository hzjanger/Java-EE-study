package com.hzj.ioc;

public class UserServiceImpl implements UserService {

    private String name;
    public void say() {
        System.out.println("hello world " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
