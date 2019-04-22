package com.dcqc.demo.学习笔记.基础.接口和抽象类;

/**
 * @program: java-learning
 * @description 接口需要实现
 * @author: duochiqingcai
 * @create: 2019-03-19 10:40
 **/
public interface DemoInterface {
    //接口属性，访问修饰符默认为public static final，且需要赋值初始化定义为常量，即公共静态常量
    public static final String name = "接口名称";
    //这样会报错
    //public static final String name1;

    //注：Java8之后，允许定义静态方法且可以有实现
    public static void doSomtheing() {
        System.out.println("这是接口的静态方法。");
    }

    //但是还是不允许有静态代码块，这样会报错
//    static {
//        System.out.println("接口静态代码块。");
//    };


    //方法默认修饰符public abstract，没有实现
    public abstract void doOtherthing();
}
