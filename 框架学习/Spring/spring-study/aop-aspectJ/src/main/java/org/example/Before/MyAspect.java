package org.example.Before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
import java.util.Date;

/**
 * @Aspect:是aspectJ框架的注解，表示当前类是切面类，给业务方法增加功能的类
 */
@Aspect
public class MyAspect {
    /**
     * 定义方法，实现切面功能
     * 要求：
     * 1、public方法
     * 2、void，无返回值
     * 3、参数可有可无，但类型不是自定义的，有几个参数类型可以使用
     */
    /**
     * @Before：前置通知注解
     * value，是切入点表达式，表示切面功能执行位置
     * 位置：方法上面
     * 特点：目标方法之前执行
     */
    /*@Before(value = "execution(public void org.example.Before.SomeServiceImpl.doSome(String ,int ))")
    public void myBefore(){
        System.out.println("切面功能，在目标方法前输出时间"+new Date());
    }*/

    /**
     * JoinPoint：指定通知方法中的参数,如果切面功能用到方法的信息，就加入JoinPoint
     * 作用：可以在通知方法中获取方法执行时的信息，如方法名称，方法实参
     * 必须时第一个参数
     */
    @Before(value = "execution(public void org.example.Before.SomeServiceImpl.doSome(String ,int ))")
    public void myBefore(JoinPoint jp){
        //获取方法的完整定义
        System.out.println("方法签名"+jp.getSignature());
        System.out.println("方法名称"+jp.getSignature().getName());
        System.out.println("方法实参"+ Arrays.toString(jp.getArgs()));
        System.out.println("切面功能，在目标方法前输出时间"+new Date());
    }
}
