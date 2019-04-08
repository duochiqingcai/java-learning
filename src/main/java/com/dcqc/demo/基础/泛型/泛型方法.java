package com.dcqc.demo.基础.泛型;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-08 14:04
 **/
public class 泛型方法 {
    public static void main(String[] args) {
        泛型方法.doSomething();
    }

    public static <T> void doSomething() {
        System.out.println("这是泛型方法");
    }

    public <T> T doSomething2() {
        return null;
    }
}
