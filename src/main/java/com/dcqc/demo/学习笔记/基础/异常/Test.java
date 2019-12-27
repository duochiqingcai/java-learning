package com.dcqc.demo.学习笔记.基础.异常;

import java.sql.SQLException;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-09 21:20
 **/
public class Test {
    public static void main(String[] args){

        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        } catch (RuntimeException e) {
            System.out.println("catch一个异常~"+e.getClass());
            throw new MyException("001", "异常发生了");

        }
        System.out.println("try...catch捕获异常后继续运行~");
    }
}
