package com.dcqc.demo.进阶.多线程;

/**
 * @program: java-learning
 * @description 继承Thread类
 * @author: duochiqingcai
 * @create: 2019-03-25 14:55
 **/
public class DemoThread extends Thread {
    public DemoThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("继承Thread的新线程...");

    }
}
