package com.dcqc.demo.基础.接口和抽象类;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-19 11:22
 **/
public class DemoAbstractClassEx extends DemoAbstractClass {

    //子类构造方法
    public DemoAbstractClassEx(String name) {
        super(name);
    }

    @Override
    public void doOtherThing() {
        System.out.println("子类继承抽象类，并重写方法。");
        System.out.println(name);
    }
}
