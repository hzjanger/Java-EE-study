package assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComplexUser {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComplexUser complexUser = (ComplexUser) applicationContext.getBean("user1");
        System.out.println(complexUser);

        ComplexUser complexUser1 = (ComplexUser) applicationContext.getBean("complexUser2");
        System.out.println(complexUser1);
    }
}
