package org.example.AfterThrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    /**
     * 异常通知AfterThrowing，格式：
     * 1、public
     * 2、无返回值
     * 3、参数必须有Exception，还可以有JoinPoint，没有后面的也行，前面的必须有
     * 属性：value   切入点表达式
     * throwing  自定义的变量，表示目标方法抛出的异常对象，变量名必须和方法参数名一样
     * 特点：1、在目标方法抛出异常时执行
     * 2、可以做异常的监控程序
     */
    @AfterThrowing(value = "execution(public void org.example.AfterThrowing.SomeServiceImpl.doSecond(String,int ))",throwing = "e")
    public void myAfterThrowing(Exception e){
        System.out.println("异常通知，方法发生异常时执行");
        e.printStackTrace();
        System.out.println("---------");
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        System.out.println(e.getCause());
        System.out.println(e.getStackTrace());
    }

}
