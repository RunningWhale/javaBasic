package org.example.多文件配置;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("多文件配置/total.xml");
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }
}
