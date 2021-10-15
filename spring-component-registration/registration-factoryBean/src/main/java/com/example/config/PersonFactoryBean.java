package com.example.config;

import com.example.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 9:51
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
