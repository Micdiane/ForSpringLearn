package com.itheima.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
    private UserDao target;
    public Object createProxy(UserDao target){
        this.target = target;
        // 创建jdk代理对象 需要三个参数
        // 1. 类加载器
        // 2. 接口数组
        // 3. 处理器
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        Class<?>[] classes = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, classes, this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.checkPermission();
        Object obj = method.invoke(new UserDaoImpl(), args);
        myAspect.log();
        return obj;
    }
}
