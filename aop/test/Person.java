package aop.test;

import org.springframework.stereotype.Service;

/**
 * Created by wqh on 2018/2/9.
 */
@Service
public class Person {
    public void eat() {
        System.out.println("eat.....");
    }
}
