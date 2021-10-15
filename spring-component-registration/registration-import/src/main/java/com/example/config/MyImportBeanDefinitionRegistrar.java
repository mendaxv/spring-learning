package com.example.config;

import com.example.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhouwei
 * @description: 自定义ImportBeanDefinitionRegistrar
 * @date 2021/10/14 17:19
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition personBeanDefinition = new RootBeanDefinition(Person.class);
        registry.registerBeanDefinition("person", personBeanDefinition);
    }
}
