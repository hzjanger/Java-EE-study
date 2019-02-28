package dynamic.jdk;

public class JDKDynamicTest {
    public static void main(String[] args) {
        //创建代理方法
        JDKDynamicProxy dynamicProxy = new JDKDynamicProxy();
        //创建对象
        TestDao testDao = new TestDaoImpl();
        //从代理对象中获取增强后的目标对象,该对象是一个被代理的对象,他会进入代理的逻辑方法ivoke
        TestDao testDaoAdvice = (TestDao) dynamicProxy.createProxy(testDao);
        //执行方法
        testDaoAdvice.save();
        System.out.println("================");
        testDaoAdvice.modify();
        System.out.println("================");

        testDaoAdvice.delete();
        System.out.println("================");

    }
}
