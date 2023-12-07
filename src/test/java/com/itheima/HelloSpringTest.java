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

    @Test
    void testUser1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object bean1 = ac.getBean("bean1");
        Object bean1_1 = ac.getBean("bean1"); // 单例模式 哈希值一样
        Object bean2 = ac.getBean("bean2");
        Object bean2_1 = ac.getBean("bean2");

        System.out.println(bean1);
        System.out.println(bean1_1);
        System.out.println(bean2);
        System.out.println(bean2_1);


    }
}