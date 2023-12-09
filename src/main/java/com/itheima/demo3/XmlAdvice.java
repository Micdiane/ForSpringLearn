package com.itheima.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
    public void before(JoinPoint joinPoint){
        System.out.println("前置增强");
        System.out.println("目标对象："+joinPoint.getTarget());
        System.out.println("增强方法："+joinPoint.getSignature().getName());
    }
    public void  afterReturning(){
        System.out.println("后置增强");


    }
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("异常抛出增强");
        System.out.println("目标对象："+joinPoint.getTarget());
        System.out.println("增强方法："+joinPoint.getSignature().getName());
        System.out.println("异常信息："+throwable.getMessage());
    }
    public void after(JoinPoint joinPoint){
        System.out.println("最终增强");
        System.out.println("目标对象："+joinPoint.getTarget());
        System.out.println("增强方法："+joinPoint.getSignature().getName());
    }
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("环绕增强");
        Object result;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("增强方法：" + joinPoint.getSignature().getName());
        return result;
    }

}
