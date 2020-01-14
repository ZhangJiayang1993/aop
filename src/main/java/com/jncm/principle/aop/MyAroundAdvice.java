package com.jncm.principle.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕 运行前通知");
        invocation.proceed();
        System.out.println("环绕 运行后通知");
        return null;
    }
}
