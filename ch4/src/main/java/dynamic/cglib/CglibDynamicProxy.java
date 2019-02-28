package dynamic.cglib;


import dynamic.aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//导包的时候不要导错了,需要导入springframework下的包
public class CglibDynamicProxy implements MethodInterceptor {

    /**
     * 创建代理的方法,生成CGLIB代理对象
     * target是目标对象,需要增强的对象
     * 放回目标对象的CGLIB代理对象
     * @param target
     * @return
     */
    public Object createProxy(Object target) {
        //创建一个动态类对象,即增强类对象
        Enhancer enhancer = new Enhancer();
        //确定需要增强的类,设置其父类
        enhancer.setSuperclass(target.getClass());
        //确定逻辑对象为当前对象,要求当前对象实现MethodInterceptor的方法
        enhancer.setCallback(this);
        //返回创建的代理对象
        return enhancer.create();

    }


    /**
     * intercept方法会在程序执行目标方法时被调用
     * @param proxy 是CGLIB根据指定的父类生成的代理对象
     * @param method 是拦截方法
     * @param args 是拦截方法的参数数组
     * @param methodProxy 是方法的代理对象,用于执行父类的方法
     * @return 返回代理结果
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //创建一个切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check();
        myAspect.except();
        Object object = methodProxy.invokeSuper(proxy, args);
        //后增强
        myAspect.log();
        myAspect.monitor();
        return object;
    }
}
