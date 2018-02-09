package aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/9.
 */
public class TestAop {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-aop.xml");
        Person person =(Person) applicationContext.getBean("person");
        person.eat();
    }
}
