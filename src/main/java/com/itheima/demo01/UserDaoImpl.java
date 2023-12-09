package com.itheima.demo01;

public class UserDaoImpl implements UserDao{
    @Override
    public void saveUser() {
        System.out.println("保存用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
