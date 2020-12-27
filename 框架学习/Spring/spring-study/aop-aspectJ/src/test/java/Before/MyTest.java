package Before;

import org.example.Before.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config="Before/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doSome("赵丽颖",20);

    }
}
