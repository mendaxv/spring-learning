package com.example.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 15:06
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------------PersonC.postProcessBeforeInitialization()-------------, beanName:"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------------PersonC.postProcessAfterInitialization()-------------, beanName:"+beanName);
        return bean;
    }
}
