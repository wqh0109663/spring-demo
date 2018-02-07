package statics.test;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by wqh on 2018/2/7.
 */
public class CarFactoryBean implements FactoryBean<Cars> {
    //返回的是 bean
    @Override
    public Cars getObject() throws Exception {
        return new Cars("baoma", 2000000);
    }

    //返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Cars.class;
    }

    //返回的是是否为单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
