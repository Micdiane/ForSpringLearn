package com.itheima.demo4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect public class AnnoAdvice {
    @Pointcut("execution(* com.itheima.demo4.UserDaoImpl.*(..))")
    public void pointcut(){}

    @Before("pointcut()") // 在切入点方法之前执行
    public void before(){
        System.out.println("前置增强");
    }

    @After("pointcut()") // 在切入点方法之后执行
    public void after(){
        System.out.println("后置增强");
    }

    @Around("pointcut()") // 环绕增强
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("环绕增强");
        Object result;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("增强方法："+joinPoint.getSignature().getName());
        return result;
    }

    @AfterThrowing("pointcut()") // 在切入点方法正常执行之后执行
    public void afterThrowing(){
        System.out.println("异常抛出增强");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("正常返回才会执行");
    }



}
