package anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/8.
 */
public class TestDemoUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-anno.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user);
    }
}
