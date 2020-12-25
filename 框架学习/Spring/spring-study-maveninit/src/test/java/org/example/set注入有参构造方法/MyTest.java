package org.example.set注入有参构造方法;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("set注入有参构造方法/applicationContext.xml");
        Student myStudent =(Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }
}
