package After;

import org.example.After.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void tes01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("After/applicationContext.xml");
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doThird("贾乃亮", 21);
    }
}
