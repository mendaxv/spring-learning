package com.example.config;

import com.example.bean.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/13 14:38
 */
@Configuration
public class MainConfig {

    /**
     * @Bean：向Spring容器注册一个bean
     * bean的名称规则：默认为方法名(person)，也可自定义名称，eg:@Bean("person001")
     *
     * @Scope：设置组件作用域
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON 单实例
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE 多实例
     * 。。。
     *
     * @Lazy:懒加载，针对单实例
     * 只在第一次获取时创建对象
     */
    @Bean
    //@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    //@Lazy
    public Person person() {
        return new Person("tom", 20);
    }

}
