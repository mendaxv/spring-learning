package com.example.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhouwei
 * @description: 按条件注册组件,linux系统
 * @date 2021/10/13 17:17
 */
public class LinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (context.getEnvironment().getProperty("os.name").contains("Linux")) {
            return true;
        }
        return false;
    }
}
