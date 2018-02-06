package vo.circle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by wqh on 2018/2/6.
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

/*bean 实力本身
*beanName IOC容器中配置的bean的名字
* return 返回的是用户的那个bean 但是返回的可以在那两个方法中修改 返回一个新的bean
* */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+bean+","+beanName);
        return bean;

    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+bean+","+beanName);
        NewPerson newPerson = new NewPerson();
        newPerson.setAge(29);
        newPerson.setName("laowang");
        return newPerson;
    }
}
