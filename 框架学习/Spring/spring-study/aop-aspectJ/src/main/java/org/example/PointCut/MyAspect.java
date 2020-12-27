package org.example.PointCut;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    /**
     * @PointCut:定义和管理切入点，如果有多个相同切入点表达式，可以使用@PointCut 属性：value  切入点表达式
     * 位置：方法之上
     * 特点：  当定义在方法上时，此时这个方法的名称就是切入点表达式的别名，
     * 其他的通知中，value属性就可以使用这个方法名称，代替切入点表达式
     */

    @After(value = "mypt()")
    public void myAfter() {
        System.out.println("最终通知总是会被执行");
    }

    @Before(value = "mypt()")
    public void myBefore() {
        System.out.println("前置通知");
    }
    @Pointcut(value = "execution(public void org.example.PointCut.SomeServiceImpl.doThird(String ,int))")
    private void mypt(){

    }
}
