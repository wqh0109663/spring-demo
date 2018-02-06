package org.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/6.
 */
public class TestCar {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Car car2 = (Car)applicationContext.getBean("car2");
        //CarEntity car1 = (CarEntity)applicationContext.getBean("car");
        //System.out.println(car1.toString());
        System.out.println(car2.toString());
    }




}
