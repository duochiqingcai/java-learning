package com.dcqc.demo.学习笔记.基础.运算符;

/**
 * @program: interview
 * @description && || ! ^ ;与、或、非、异或
 * @author: duochiqingcai
 * @create: 2019-03-10 23:06
 **/
public class 逻辑运算符 {
    public static void main(String[] args) {
        System.out.println((7>6)&&(7>8));

        //异或，有且只有一个为真，才为真
        System.out.println((7>6)^(7>8));
    }
}
