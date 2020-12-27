package Around;

import org.example.Around.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Around/applicationContext.xml");
        SomeService proxy = (SomeService) ac.getBean("someService");
        String 郑恺 = proxy.doFirst("郑恺", 20);
        System.out.println(郑恺);
    }
}
