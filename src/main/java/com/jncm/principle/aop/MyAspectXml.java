package com.jncm.principle.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {
//前置通知
public void before() {
    System.out.println("xml方式前置通知 before");
}

//后置通知
public void afterReturning(Object result) {
    System.out.println("xml方式后置通知 after");
}

//环绕通知
public Object around(ProceedingJoinPoint proceedingJoinPoint) {
    System.out.println("环绕通知1");
    try {
        return proceedingJoinPoint.proceed();
    } catch (Throwable throwable) {
        throwable.printStackTrace();
    }
    System.out.println("环绕通知2");
    return null;
}

}
