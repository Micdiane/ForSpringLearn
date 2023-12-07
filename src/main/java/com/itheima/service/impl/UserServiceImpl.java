package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;


    @Override
    public void save() {
        userDao.save();
        System.out.println("调用了UserService的方法");
    }
}
