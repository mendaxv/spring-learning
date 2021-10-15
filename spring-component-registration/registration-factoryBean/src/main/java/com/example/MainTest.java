package com.example;

import com.example.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 9:42
 */
public class MainTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        //for (String name : beanDefinitionNames) {
        //    System.out.println(name);
        //}
        //获取person
        Class<?> bean = applicationContext.getBean("personFactoryBean").getClass();
        System.out.println("bean的类型：" + bean);
        //获取personFactoryBean
        Class<?> bean2 = applicationContext.getBean("&personFactoryBean").getClass();
        System.out.println("bean2的类型：" + bean2);
    }

}
