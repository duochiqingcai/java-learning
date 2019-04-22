package com.dcqc.demo.学习笔记.基础.this和super;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-19 16:40
 **/
public class Test {
    public static void main(String[] args) {
        //无参实例化
        DemoZi demoZi = new DemoZi();
        demoZi.doSomething();

        System.out.println("===================分割符==================");

        DemoZi demoZi1 = new DemoZi("有参");
        demoZi1.doSomething();

    }
}
