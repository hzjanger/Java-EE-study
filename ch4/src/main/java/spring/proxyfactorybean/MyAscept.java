package spring.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAscept implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //增强方法
        check();
        except();
        //执行目标方法
        Object object = invocation.proceed();
        //增强方法
        log();
        modify();
        return object;
    }

    public void check() {
        System.out.println("模拟权限控制");
    }

    public void except() {
        System.out.println("模拟异常处理");
    }

    public void log() {
        System.out.println("模拟日志记录");
    }

    public void modify() {
        System.out.println("性能监测");
    }

}
