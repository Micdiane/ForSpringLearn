package com.itheima.contoller;

import com.itheima.User1;
import com.itheima.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController implements UserService {
    @Resource(name = "userService")
    private UserService userService;

    public void save(){
        userService.save();
        System.out.println("调用了UserController的方法");
    }

}
