package com.dcqc.demo.基础.接口和抽象类;

/**
 * @program: java-learning
 * @description 抽象类只要被继承才可以实例化
 * @author: duochiqingcai
 * @create: 2019-03-19 10:24
 **/
public abstract class DemoAbstractClass {
    //抽象类属性
    public String name;

    //抽象类构造方法
    public DemoAbstractClass(String name) {
        this.name = name;
    }

    //静态方法
    public static void doSomething() {
        System.out.println("这是抽象类的静态方法。");
    }

    //抽象方法，无实现,这里个人理解和接口的方法类似
    public abstract void doOtherThing();

}
