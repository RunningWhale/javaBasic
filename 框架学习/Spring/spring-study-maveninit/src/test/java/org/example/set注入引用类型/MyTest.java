package org.example.set注入引用类型;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    //控制正转
    @Test
    public void test01() {
        Student student = new Student();
        student.setName("范冰冰");
        student.setAge(20);
        School school = new School();
        school.setName("上海师范大学谢晋影视艺术学院");
        school.setAddress("上海");
        student.setSchool(school);
        System.out.println(student.toString());
    }
    //控制反转
    @Test
    public void test02(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("set注入引用类型/applicationContext.xml");
        Student mystudent =(Student) ac.getBean("mystudent");
        System.out.println(mystudent);
    }
}
