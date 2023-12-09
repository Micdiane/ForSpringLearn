package com.itheima.demo2;

import com.itheima.demo01.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCglibProxy implements MethodInterceptor {

    public Object createProxy(Object target){
        // 创建cglib代理对象
        // 1. 创建核心类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调
        enhancer.setCallback(this);
        // 4. 创建代理
        Object proxy = enhancer.create();
        return proxy;
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.checkPermission();
        Object o = proxy.invokeSuper(obj, args);
        myAspect.log();
        return o;
    }
}
