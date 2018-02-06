package spel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/6.
 */
public class Test {
    public static void main(String[] args) {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-spel.xml");
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person.toString());
        CarEntity carEntity = applicationContext.getBean(CarEntity.class);
        String string = carEntity.toString();
        System.out.println(string);

    }
}
