package com.itheima.Factory;

import com.itheima.beans.Bean1;
import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory implements FactoryBean<Bean1> {
    @Override
    public Bean1 getObject() throws Exception {
        return new Bean1();
    }

    @Override
    public Class<?> getObjectType() {
        return Bean1.class;
    }
}
