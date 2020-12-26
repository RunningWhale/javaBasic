package 简单类型赋值;

import org.example.简单类型赋值.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("简单类型赋值/applicationContext.xml");
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }
}
