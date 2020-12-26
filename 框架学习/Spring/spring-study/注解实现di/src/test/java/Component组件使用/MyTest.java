package Component组件使用;

import org.example.Component组件使用.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Component组件使用/applicationContext.xml");
        Student myStudent = (Student) ac.getBean("student");
        System.out.println(myStudent);
    }
}
