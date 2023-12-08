package com.itheima;

import com.itheima.contoller.UserController;
import com.itheima.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void test1(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
        AbstractApplicationContext ac2 = (AbstractApplicationContext) ac;
        ac2.registerShutdownHook();
    }
}
