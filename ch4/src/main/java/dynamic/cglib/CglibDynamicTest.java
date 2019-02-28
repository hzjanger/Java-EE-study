package dynamic.cglib;

public class CglibDynamicTest {
    public static void main(String[] args) {
        //创建代理对象
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy();
        //创建目标对象
        TestDao testDao = new TestDao();
        //获取增强后的目标对象
        TestDao testDaoAdvice = (TestDao) cglibDynamicProxy.createProxy(testDao);
        //执行方法
        testDaoAdvice.save();
        System.out.println("==============");
        testDaoAdvice.modify();
        System.out.println("==============");
        testDaoAdvice.delete();
    }

}
