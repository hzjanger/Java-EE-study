package spring.proxyfactorybean;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取增强后的对象类
        TestDao testDao = (TestDao) applicationContext.getBean("testDaoProxy");
        //执行方法
        testDao.save();
        System.out.println("======================");
        testDao.modify();
        System.out.println("======================");
        testDao.delete();
    }
}
