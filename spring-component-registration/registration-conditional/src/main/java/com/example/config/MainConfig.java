package com.example.config;

import com.example.bean.Person;
import com.example.condition.LinuxCondition;
import com.example.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/13 16:29
 */
@Configuration
public class MainConfig {

    @Bean(name = "person")
    public Person person() {
        return new Person("person", 20);
    }

    @Bean(name = "personA")
    @Conditional(value = LinuxCondition.class)
    public Person personA() {
        return new Person("personA", 21);
    }

    @Bean(name = "personB")
    @Conditional(value = WindowsCondition.class)
    public Person personB() {
        return new Person("personB", 22);
    }

}
