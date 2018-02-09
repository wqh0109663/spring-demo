package anno.test;

import org.springframework.stereotype.Component;

/**
 * Created by wqh on 2018/2/8.
 * controller web层
 * service 业务层  四个功能一样
 * repository 持久层
 * 还有下面的一个注解
 */

@Component(value = "user")
public class User {
    private String name ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }
}
