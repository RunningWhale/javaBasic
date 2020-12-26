package org.example;

import org.example.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;

public class MyTest {
    //控制正转
    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void test02() {
        //1、指定spring配置文件的名称
        String config = "beans.xml";
        //2、ApplicationContext表示spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext表示从类路径加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //3、获取对象
        SomeService someService = (SomeServiceImpl) ac.getBean("someService");
        someService.doSome();
    }

    //spring常用方法
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取容器中对象的数量
        int beanDefinitionCount = ac.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
        //获取容器中所有对象名称
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }

    //获取非自定义类型对象
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date mydate = (Date) ac.getBean("mydate");
        System.out.println(mydate);
    }
}
