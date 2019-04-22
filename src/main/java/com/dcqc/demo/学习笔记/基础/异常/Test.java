package com.dcqc.demo.学习笔记.基础.异常;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-09 21:20
 **/
public class Test {
    public static void main(String[] args) throws Exception {

        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        } catch (Exception e) {
            throw new MyException("001", "异常发生了");
        }
    }
}
