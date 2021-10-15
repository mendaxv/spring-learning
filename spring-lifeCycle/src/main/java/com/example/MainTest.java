package com.example;

import com.example.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhouwei
 * @description: 定制初始化逻辑、销毁逻辑
 * @date 2021/10/15 13:43
 */
public class MainTest {

    public static AnnotationConfigApplicationContext context;

    static {
        context = new AnnotationConfigApplicationContext(MainConfig.class);
    }

    public static void main(String[] args) {

        //1.在@Bean中指定初始化方法、销毁方法
        Object person = context.getBean("person");

        //2.实现接口InitializingBean、DisposableBean
        Object personA = context.getBean("person");

        //3.@PostConstruct、@PreDestroy
        Object personB = context.getBean("person");

        //4.BeanPostProcessor
        Object personC = context.getBean("personC");

        context.destroy();
    }


}
