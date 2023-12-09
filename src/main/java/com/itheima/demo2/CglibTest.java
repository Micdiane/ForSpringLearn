package com.itheima.demo2;

public class CglibTest {
    public static void main(String[] args) {
        // 1. 创建目标对象
        UserDao2 userDao2 = new UserDao2();
        // 2. 创建代理对象
        MyCglibProxy myCglibProxy = new MyCglibProxy();
        UserDao2 proxy = (UserDao2) myCglibProxy.createProxy(userDao2);
        // 3. 执行方法
        proxy.saveUser();
        proxy.deleteUser();
    }
}
