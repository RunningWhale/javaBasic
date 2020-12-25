package org.example.set注入简单类型;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public  void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("set注入简单类型/applicationContext.xml");
        Student mystudent = (Student) ac.getBean("mystudent");
        System.out.println(mystudent);
        Date mydate =(Date) ac.getBean("mydate");
        System.out.println(mydate);
    }
}
