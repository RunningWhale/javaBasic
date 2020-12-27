package org.example.After;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    /**最终通知
     * 1、public
     * 2、无返回值
     * 3、无参数，有的话就是JoinPoint
     *属性：value  切入点表达式
     * 位置 方法之上
     * 特点：1、总是会执行
     * 2、目标方法之后执行
     */

@After(value = "execution(public void org.example.After.SomeServiceImpl.doThird(String ,int))")
    public void myAfter(){
    System.out.println("最终通知总是会被执行");
//    一般是做资源清除通知的
    }
}
