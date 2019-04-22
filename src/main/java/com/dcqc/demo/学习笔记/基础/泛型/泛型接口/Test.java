package com.dcqc.demo.学习笔记.基础.泛型.泛型接口;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-08 12:34
 **/
public class Test {
    public static void main(String[] args) {
        //泛型接口Impl1分别指定String和Integer
        泛型接口Impl1<String> impl1 = new 泛型接口Impl1<>();
        泛型接口Impl1<Integer> impl11 = new 泛型接口Impl1<>();

        impl1.doSomething();
        impl11.doSomething();

        //泛型接口Impl已指定String，使用其他类型会报错
        泛型接口Impl2 impl2 = new 泛型接口Impl2();
        impl2.doSomething();
    }
}
