package org.example.Component组件使用;

import org.springframework.stereotype.Component;

/**
 * @Component: 创建对象，等同于<bean>的功能
 * 属性：value：对象的名称就是bean的id
 * 在类的上面
 */
//1、完整写法
//   @Component(value = "myStudent")
//2、省略value属性
//    @Component("myStudent")
//3、省略名称，默认类名首字母小写
    @Component
public class Student {
    private String name;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
