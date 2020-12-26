package org.example.自动注入;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
@Test
public void test01(){
    ApplicationContext ac=new ClassPathXmlApplicationContext("自动注入/applicationContext.xml");
    Student myStudent = (Student) ac.getBean("myStudent");
    System.out.println(myStudent);

}
}
