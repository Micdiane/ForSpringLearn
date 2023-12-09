package com.itheima.demo01;

import com.itheima.demo01.UserDao;

public class JDKProxyTest {
    public static void main(String[] args) {
        MyProxy myProxy = new MyProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao proxy = (UserDao) myProxy.createProxy(userDao);

        proxy.saveUser();
        proxy.deleteUser();
    }
}
