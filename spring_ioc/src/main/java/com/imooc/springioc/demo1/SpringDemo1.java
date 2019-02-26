package com.imooc.springioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
    @Test
    /**
     * 传统方式开发
     */
    public void demo01() {
        UserService userService = new UserServiceImpl();
        userService.say();
    }

    @Test
    /**
     *
     */
    public void demo02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.say();


    }
}
