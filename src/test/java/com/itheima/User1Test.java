package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class User1Test {

    @Test
    void testToString() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1 user1 = (User1) ac.getBean("user1");
        System.out.println(user1);
        // 实现注入
    }

    @Test
    void testToString2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 user2 = (User2) ac.getBean("user2");
        System.out.println(user2);
        // 实现注入
    }
}