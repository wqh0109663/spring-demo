package aop.test1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by wqh on 2018/2/9.
 */
@Component
@Aspect
public class NewPerson {
    //前置增强
    @Before(value = "execution(* aop.test1.Person.*(..))")
    public void beforeEat() {
        System.out.println("beforeEat。。。。");
    }

    //环绕增强
    @Around(value = "execution(* aop.test1.Person.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //方法之前
        System.out.println("执行之前");

        //被增强的方法
        proceedingJoinPoint.proceed();


        //方法之后
        System.out.println("执行之后");


    }
}





