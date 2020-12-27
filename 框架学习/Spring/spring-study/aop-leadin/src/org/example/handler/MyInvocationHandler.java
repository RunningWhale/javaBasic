package org.example.handler;

import org.example.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    //目标对象
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    public Object invoke1(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行了invoke");
        Object res = null;
        ServiceTools.doLog();
//执行目标类的方法，返回目标方法的执行结果
        res = method.invoke(target, args);
        ServiceTools.doTrans();
        return res;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        String methodName = method.getName();
        if ("doSome".equals(methodName)) {
            ServiceTools.doLog();
            res = method.invoke(target, args);
            ServiceTools.doTrans();
        } else {
            res = method.invoke(target, args);
        }
        return res;

    }
}
