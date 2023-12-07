package com.itheima;

public class HelloSpring {
    private String username;
    public void setUsername(String username) {
        this.username = username;
    }
    public void sayHello() {
        System.out.println("Hello " + this.username);
    }
}
