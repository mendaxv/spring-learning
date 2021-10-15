package com.example;

import com.example.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhouwei
 * @description: 通过@configuration、@Bean向IOC容器注册组件
 * @date 2021/10/13 14:35
 */
public class MainTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = applicationContext.getBean("person");
        System.out.println(person);
    }

}
