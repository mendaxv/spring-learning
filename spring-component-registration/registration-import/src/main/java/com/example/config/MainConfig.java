package com.example.config;

import com.example.bean.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/14 16:34
 */
@Configuration
@Import(Person.class)
//@Import(value = MyImportSelector.class)
//@Import(value = MyImportBeanDefinitionRegistrar.class)
public class MainConfig {
}
