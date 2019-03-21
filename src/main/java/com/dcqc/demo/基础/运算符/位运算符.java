package com.dcqc.demo.基础.运算符;

import org.springframework.boot.autoconfigure.web.ServerProperties;

import java.util.HashMap;

/**
 * @program: interview
 * @description 操作符    描述	                               例子
 * ＆	如果相对应位都是1，则结果为1，否则为0	（A＆B），得到12，即0000 1100
 * |	如果相对应位都是0，则结果为0，否则为1	（A | B）得到61，即 0011 1101
 * ^	如果相对应位值相同，则结果为0，否则为1	（A ^ B）得到49，即 0011 0001
 * 〜	按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	（〜A）得到-61，即1100 0011
 * << 	按位左移运算符。左操作数按位左移右操作数指定的位数。	A << 2得到240，即 1111 0000
 * >> 	按位右移运算符。左操作数按位右移右操作数指定的位数。	A >> 2得到15即 1111
 * >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。	A>>>2得到15即0000 1111
 * @author: duochiqingcai
 * @create: 2019-03-10 23:20
 **/
public class 位运算符 {

    public static void main(String[] args) {
        //0000 1010
        int a = 10;
        //0001 0100
        int b = 20;

        //&  位与 结果0，0000 0000
        System.out.println("这是位与&：" + (a & b));
        //|  位或 结果30,0001 1110
        System.out.println("这是位或|：" + (a | b));
        //~  位非 结果-21,1110 1011  为什么为什么？？？？？
        System.out.println("这是或非~：" + (~b));
        //^  位异或 结果30,00011110
        System.out.println("这是异或：" + (a ^ b));
        //<< 位左移2位（看箭头方向） 结果80,01010000
        System.out.println("这是位左移：" + (b << 2));
        //>> 位右移2位 结果5,00000101
        System.out.println("这是位右移：" + (b >> 2));
        //>>> 位右移补零 结果5,00000101
        System.out.println("这是右位移补零：" + (b >>> 2));
        //结果3,0000 0011
        System.out.println("这是右位移补零：" + (15 >>> 2));
    }
}
