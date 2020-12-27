package AfterReturning;

import org.example.AfterReturning.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("AfterReturning/applicationContext.xml");
        SomeService proxy=(SomeService)  ac.getBean("someService");
        proxy.doOther("秦始皇",15);
    }
}
