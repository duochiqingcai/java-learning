package com.dcqc.demo.基础.泛型.泛型接口;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-08 12:33
 **/
public class 泛型接口Impl2 implements 泛型接口<String> {
    @Override
    public String doSomething() {
        System.out.println("这是泛型接口实现类2");

        return "Nihao,这是2";
    }
}
