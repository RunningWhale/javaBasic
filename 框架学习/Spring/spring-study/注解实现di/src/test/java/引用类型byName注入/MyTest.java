package 引用类型byName注入;

import org.example.引用类型byName注入.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("引用类型byName注入/applicationContext.xml");
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }
}
