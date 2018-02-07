package statics.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/7.
 */
public class TestStatic {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-staticfactory.xml");
        Cars staticFactoryBean = (Cars)applicationContext.getBean("staticFactoryBean");
        String string = staticFactoryBean.toString();
        System.out.println(string);
        Cars car1 = (Cars)applicationContext.getBean("car1");
        String string1 = car1.toString();
        System.out.println(string1);
        Cars car2 = (Cars)applicationContext.getBean("car2");
        String string2 = car2.toString();
        System.out.println(string2);
    }


}
