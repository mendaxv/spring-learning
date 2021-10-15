package com.example.bean;

/**
 * @author zhouwei
 * @description:
 * @date 2021/10/15 13:43
 */
public class Person {

    private String name;
    private Integer age;

    public void init() {
        System.out.println("----------Person.init----------");
    }

    public void destroy() {
        System.out.println("----------Person#destroy----------");
    }
}
