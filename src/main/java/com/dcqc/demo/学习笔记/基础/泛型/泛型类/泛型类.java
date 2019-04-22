package com.dcqc.demo.学习笔记.基础.泛型.泛型类;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-08 12:45
 **/
public class 泛型类<T> {
    private T key;

    public 泛型类(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
