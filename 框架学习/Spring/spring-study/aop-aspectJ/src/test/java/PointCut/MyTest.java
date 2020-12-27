package PointCut;

import org.example.PointCut.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("PointCut/applicationContext.xml");
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doThird("范冰冰",15);
        System.out.println(proxy.getClass().getName());
    }
}
