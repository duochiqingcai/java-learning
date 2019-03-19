package com.dcqc.demo.数据结构和算法.数组Array;

/**
 * @program: java-learning
 * @description 数组
 * @author: duochiqingcai
 * @create: 2019-03-19 22:34
 **/
public class DemoArray {
    public static void main(String[] args) {

        //数组的3中创建方法
        //方法一：数据类型 []  数组名称 = new 数据类型[数组长度]，定义给定长度数组，如果有空间未存放数据，则默认int类型为0
        int[] array = new int[5];
        array[0] = 0;
        array[1] = 1;
        //......

        //int类型默认为0
        System.out.println(array[4]);


        //方法二：数据类型 [] 数组名称 = {数组元素1，数组元素2，......}，数组长度由元素个数决定
        String[] array1 = {"0", "1", "2", "3", "4"};

        System.out.println(array1[1]);
        //越界访问，抛出异常
        //System.out.println(array1[7]);


        //方法三：数据类型 []  数组名称 = new 数据类型[]{数组元素1，数组元素2，......}
        String[] array2 = new String[]{"0", "1", "2", "3", "4"};

        System.out.println(array2[3]);


        //数组的地址
        //定义数组,int的字节长度为4字节，占4内存空间为4
        int[] array3 = {1, 2, 3, 4, 5};
        //数组内存首地址，16进制
        System.out.println(array3.toString());

    }
}
