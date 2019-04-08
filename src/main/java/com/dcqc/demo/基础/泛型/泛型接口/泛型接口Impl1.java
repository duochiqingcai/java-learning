package com.dcqc.demo.基础.泛型.泛型接口;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-08 12:27
 **/
public class 泛型接口Impl1<T> implements 泛型接口<T> {


    @Override
    public T doSomething() {
        System.out.println("这是泛型接口实现类1");
        return null;
    }
}
