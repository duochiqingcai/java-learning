package com.dcqc.demo.进阶.多线程;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-25 14:57
 **/
public class Test {
    public static void main(String[] args) {
        //继承Thread类
        DemoThread demoThread = new DemoThread("线程1");
        demoThread.start();
        System.out.println(demoThread.getName());

        //实现Runnable接口
        Runnable runnable = new DemoRunnable();
        //实例化一个线程对象
        Thread thread = new Thread(runnable, "线程2");
        thread.start();
        System.out.println(thread.getName());


        //使用线程池



    }
}
