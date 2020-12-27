package AfterThrowing;

import org.example.AfterThrowing.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("AfterThrowing/applicationContext.xml");
        SomeService proxy =(SomeService) ac.getBean("someService");
        proxy.doSecond("李玉刚",20);
    }
}
