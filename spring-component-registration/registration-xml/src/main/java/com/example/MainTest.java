package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouwei
 * @description: 通过beans.xml向IOC容器注册组件
 * @date 2021/10/13 14:32
 */
public class MainTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object person = applicationContext.getBean("person");
        System.out.println(person);
    }

}
