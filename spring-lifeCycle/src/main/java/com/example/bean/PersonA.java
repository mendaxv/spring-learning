package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 14:12
 */
public class PersonA implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("------------PersonA.afterPropertiesSet()-------------");
    }

    @Override
    public void destroy() {
        System.out.println("------------PersonA.destroy()-------------");
    }
}