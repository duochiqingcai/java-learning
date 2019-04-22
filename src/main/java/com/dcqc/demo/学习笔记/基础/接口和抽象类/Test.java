package com.dcqc.demo.学习笔记.基础.接口和抽象类;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-19 10:51
 **/
public class Test {
    public static void main(String[] args) {
        //抽象类
        DemoAbstractClassEx demoAbstractClassEx=new DemoAbstractClassEx("子类");
        demoAbstractClassEx.doOtherThing();

        //接口
        DemoInterface demo=new DemoInterfaceImpl();
        demo.doOtherthing();
        DemoInterface.doSomtheing();
    }
}
