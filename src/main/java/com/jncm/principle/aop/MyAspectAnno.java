package com.jncm.principle.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectAnno {
    @Before(value = "myPointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before 通知 " + joinPoint);
    }

    @AfterReturning(value = "execution(* com.jncm.principle.aop.ProductDao.update (..))", returning = "result")
    public void afterReturning(Object result) {
        MyObject myObject = (MyObject) result;
        System.out.println("afterReturning 通知 " + myObject.getName());
        myObject.setName("success");
    }

    @Around(value = "execution(* com.jncm.principle.aop.ProductDao.delete (..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕执行前");
        MyObject obj = (MyObject) proceedingJoinPoint.proceed();
        obj.setName("delete fail");
        System.out.println("环绕执行后");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.jncm.principle.aop.ProductDao.find (..))", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("异常抛出通知 " + e.getMessage());
    }

    @After(value = "execution(* com.jncm.principle.aop.ProductDao.find (..))")
    public void after() {
        System.out.println("after advice");
    }

    @Pointcut(value = "execution(* com.jncm.principle.aop.ProductDao.save (..))")
    private void myPointcut() {}
}
