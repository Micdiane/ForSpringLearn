package com.itheima;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HelloSpringTest {

    @Test
    void sayHello() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloSpring helloSpring = (HelloSpring) ac.getBean("helloSpring");
        helloSpring.sayHello();
    }
}