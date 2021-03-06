package com.hzj.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
    @Test
    public void demo1() {
        //创建ApplicationContext容器,
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过bean的id值获取进行对象的实例化
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.say();
    }
}
