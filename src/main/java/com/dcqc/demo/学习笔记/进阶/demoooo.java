package com.dcqc.demo.学习笔记.进阶;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-12 16:22
 **/
public class demoooo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[] arr = {1, 3, 5, 67, 8, 9, 12, 7};
        System.out.println(doReverse(arr)[1]);

    }

    public static <T> T[] doReverse(T[] arr) {
        if (arr == null) return arr;

        List<T> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            list.add(arr[i]);
        }

        return list.toArray(arr);
    }

}
