package com.itheima.demo3;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("保存用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void findById() {
        System.out.println("根据id查询用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }
}
