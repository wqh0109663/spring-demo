package tx.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/10.
 */
public class TestTX {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-tx-anno.xml");
        UserService userService = context.getBean(UserService.class);
        userService.countTest();
    }


}
