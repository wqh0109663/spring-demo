package aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by wqh on 2018/2/9.
 */
@Component
public class NewPerson {
    //前置增强
    public void beforeEat() {
        System.out.println("beforeEat。。。。");
    }

    //环绕增强
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //方法之前
        System.out.println("执行之前");

        //被增强的方法
        proceedingJoinPoint.proceed();


        //方法之后
        System.out.println("执行之后");


    }
}
