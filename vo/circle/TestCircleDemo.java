package vo.circle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wqh on 2018/2/6.
 */
public class TestCircleDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-cricle.xml");
        NewPerson newPerson = (NewPerson)applicationContext.getBean("newPerson");
        System.out.println(newPerson);
        //关闭IOC容器
        applicationContext.close();
    }
}
