package aop.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/9.
 */
public class TestAop_01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-aop1.xml");
        Person person =(Person) applicationContext.getBean("person");
        person.eat();
    }
}
