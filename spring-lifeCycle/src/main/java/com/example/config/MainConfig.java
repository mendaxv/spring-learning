package com.example.config;

import com.example.bean.Person;
import com.example.bean.PersonA;
import com.example.bean.PersonB;
import com.example.bean.PersonC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 13:44
 */
@Configuration
public class MainConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Person person() {
        return new Person();
    }

    @Bean
    public PersonA personA() {
        return new PersonA();
    }

    @Bean
    public PersonB personB() {
        return new PersonB();
    }

    @Bean
    public PersonC personC() {
        return new PersonC();
    }
}
