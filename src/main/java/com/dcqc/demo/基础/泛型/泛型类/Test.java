package com.dcqc.demo.基础.泛型.泛型类;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-08 14:02
 **/
public class Test {
    public static void main(String[] args) {
        泛型类<String> generic = new 泛型类<>("这是key");

        System.out.println(generic.getKey());
    }
}
