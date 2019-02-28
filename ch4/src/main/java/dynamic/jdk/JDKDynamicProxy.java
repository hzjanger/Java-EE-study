package dynamic.jdk;

import dynamic.aspect.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {

    private TestDao testDao;

    /**
     * 创建代理的方法,建立代理对象和真实对象的代理关系,并返回代理对象
     * @param testDao
     * @return
     */
    public Object createProxy(TestDao testDao) {
        this.testDao = testDao;
        //类加载器
        ClassLoader classLoader = JDKDynamicProxy.class.getClassLoader();
        //被代理对象实现所有接口
        Class[] classes = testDao.getClass().getInterfaces();
        //使用代理类进行增强,返回代理后的对象
        return Proxy.newProxyInstance(classLoader, classes, this);

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.check();
        myAspect.except();
        //在目标类上调用方法并传入参数,相当于调用testDao中的方法
        Object object = method.invoke(testDao, args);
        myAspect.log();
        myAspect.monitor();
        return object;
    }
}
