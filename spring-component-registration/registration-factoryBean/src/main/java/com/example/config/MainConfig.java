package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 9:50
 */
@Configuration
public class MainConfig {

    @Bean
    public PersonFactoryBean personFactoryBean() {
        return new PersonFactoryBean();
    }

}
