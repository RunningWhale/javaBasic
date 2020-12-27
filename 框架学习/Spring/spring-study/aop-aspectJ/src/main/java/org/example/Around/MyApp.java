package org.example.Around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyApp {
    /**环绕通知：Around
     * 格式1、public
     * 2、必须有返回值，推荐Object
     * 3、方法参数固定，ProceedingJoinPoint
     *属性：value  切入点表达式
     * 位置：在方法之上
     * 特点：功能最强的通知
     * 1、目标方法前后都可以增强功能
     * 2、控制目标方法是否被调用执行
     * 3、修改原来目标方法执行的结果，影响最后的调用结果---就是返回值
     * 环绕通知等同于jdk动态代理的InvocationHandler接口
     * 参数：ProceedingJoinPoint相当于Method
     *      作用：执行目标方法
     * 返回值：目标方法的执行结果，可以被修改
     * 环绕通知：经常做事务。在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务。
     */
    @Around(value = "execution(public String org.example.Around.SomeServiceImpl.doFirst(String,int))")
    public Object myArround(ProceedingJoinPoint pjp) throws Throwable {
//        获取参数值
        Object args[]=pjp.getArgs();
//        2、在目标方法前加功能
        System.out.println("环绕通知，在目标方法调用前输出时间："+new Date());
//        1、目标方法调用
        Object result=pjp.proceed() ;  //method.invoke()

//        2、在目标方法后加功能
        System.out.println("环绕通知，在目标方法之后提交事务");
        result="苗苗";
        return result;
    }
}
