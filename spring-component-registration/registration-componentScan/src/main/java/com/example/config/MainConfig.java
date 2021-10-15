package com.example.config;

import com.example.bean.PersonService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/13 14:59
 */
@Configuration
//自定扫描路径下边带有@Controller，@Service，@Repository，@Component注解加入spring容器
//value:指定包扫描路径
//useDefaultFilters:是否应启用对使用@Component @Repository 、 @Service或@Controller注释的类的自动检测
//@ComponentScan(value = "com.example")
//指定组件扫描条件：不扫描@Controller
//@ComponentScan(value = "com.example", excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
//})
//指定组件扫描条件
@ComponentScan(value = "com.example",
        //排除条件
        excludeFilters = {
                //扫描注解
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
        },
        //包含条件
        includeFilters = {
                //扫描类
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {PersonService.class}),
                //自定义规则
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = {MyTypeFilter.class})
        }, useDefaultFilters = false)
public class MainConfig {
}
