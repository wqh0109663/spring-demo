package c3po.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/10.
 */
public class TestC3P0 {
    @Test
    public void test(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-c3p0.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.add();
    }


}
