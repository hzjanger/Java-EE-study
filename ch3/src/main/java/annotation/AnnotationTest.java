package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationContext.xml");
        AnnotationUser annotationUser = (AnnotationUser) applicationContext.getBean("annotationUser");
        System.out.println(annotationUser);
    }
}
