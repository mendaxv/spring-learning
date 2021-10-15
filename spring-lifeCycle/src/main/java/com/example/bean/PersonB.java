package com.example.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 14:49
 */
public class PersonB {

    @PostConstruct
    public void postConstruct() {
        System.out.println("------------PersonB.postConstruct()-------------");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("------------PersonB.preDestroy()-------------");
    }

}
