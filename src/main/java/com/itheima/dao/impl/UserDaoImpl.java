package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String username, String password) {
        if ("张三".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}
