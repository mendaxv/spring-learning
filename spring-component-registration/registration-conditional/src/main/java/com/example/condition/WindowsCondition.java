package com.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhouwei
 * @description: 按条件注册组件，Windows系统
 * @date 2021/10/13 16:38
 */
public class WindowsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        if (context.getEnvironment().getProperty("os.name").contains("Windows")) {
            return true;
        }
        return false;
    }
}
