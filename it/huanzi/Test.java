package it.huanzi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/5.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
       HelloTest a = (HelloTest)applicationContext.getBean("demo3");
        //getBean也可以使用class字节码来获得,但是这个bean的类必须只有一个对应的bean 不能有两个
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean.toString());

    }
}
