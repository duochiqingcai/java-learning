package com.dcqc.demo.基础.this和super;

/**
 * @program: java-learning
 * @description 父类
 * @author: duochiqingcai
 * @create: 2019-03-19 16:21
 **/
public class DemoThis {
    private String name;

    public DemoThis(){
        System.out.println("this无参构造方法。");
    }

    //this指当前实例化对象
    public DemoThis(String name) {
        this.name = name;
        System.out.println("this有参构造方法。"+name);
    }

    public void doSomething() {
        System.out.println("this中的方法。");
    }
}
