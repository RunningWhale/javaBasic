package org.example.简单类型赋值;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Component: 创建对象，等同于<bean>的功能
 * 属性：value：对象的名称就是bean的id
 * 在类的上面
 */
@Component("myStudent")
public class Student {
    //    @Value("张靓颖")
    private String name;
    //    @Value("20")
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    @Value("应采儿")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("22")
    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
