package org.example.AfterReturning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Aspect:是aspectJ框架的注解，表示当前类是切面类，给业务方法增加功能的类
 */
@Aspect
public class MyAspect {
    /**
     * 后置通知方法AfterReturning
     * 1、公共方法public
     * 2、方法没有返回值
     * 3、方法有参数,推荐是Object
     * 属性：1、value 切入点表达式
     * 2、returning  自定义变量，表示方法返回值   自定义变量名必须和通知方法的形参名相同
     * 位置：方法之上
     * 特点：目标方法之后执行
     * 得到目标方法返回值
     * 可以修改返回值
     */

    @AfterReturning(value = "execution(public String org.example.AfterReturning.SomeServiceImpl.doOther(String,int))", returning = "res")
    public void myAfterReturning(Object res) {
        System.out.println("后置通知,返回值是："+res);
        if ("aaa".equals(res)){

        }else {

        }
    }
}
