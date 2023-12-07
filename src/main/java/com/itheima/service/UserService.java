package com.itheima.service;

import com.itheima.dao.UserDao;

public interface UserService {

    public boolean login(String username, String password);
}
