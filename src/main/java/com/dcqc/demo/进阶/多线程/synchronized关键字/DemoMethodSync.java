package com.dcqc.demo.进阶.多线程.synchronized关键字;

import java.util.concurrent.locks.Lock;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-25 21:49
 **/
public class DemoMethodSync {

    public static void main(String[] args) {
        System.out.println("这是方法锁");
        DemoMethodSync d=new DemoMethodSync();
        d.sayHi();
    }

    public synchronized void sayHi(){
        System.out.println("HI");

    }

}
