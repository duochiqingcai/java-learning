package com.dcqc.demo.数据结构和算法.算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-learning
 * @description 冒泡排序算法demo, 每一轮比较都需要遍历所有元素，所以时间复杂度为O(n^2).双循环排序，外部循环控制所有回合，内部循环代表每一类冒泡处理。
 * https://mp.weixin.qq.com/s?src=11&timestamp=1554690782&ver=1533&signature=FFUNqCKSMhCwGaKVU22hYxSPxzlwYYCcwuLTnmN8koJSqHLHp8jwBKcHsMG2u79g56AKjOS2yDoNH4*fUX-OtFHyg7NzojCBzVXbFOlxLQnO4DYVmRBG2LoDq5gTDw76&new=1
 * @author: duochiqingcai
 * @create: 2019-04-08 08:19
 **/
public class 冒泡排序 {
    public static void main(String[] args) {
        冒泡排序 maopao = new 冒泡排序();
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(7);
        list.add(5);

        //冒泡排序.doBubbleSort1(list);
        冒泡排序.doBubbleSort2(list);

    }

    //遍历所有元素，时间复杂度O(n^2)
    public static void doBubbleSort(List<Integer> list) {
        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    temp = list.get(j);

                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                }
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    //优化一:如果最近的一轮没有发生交换，则判断排序已经完成，不再进行后续比较、交换
    public static void doBubbleSort1(List<Integer> list) {
        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            //有序标记，每一轮的初始时true
            boolean isSorted = true;

            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    temp = list.get(j);

                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    //有元素交接，所以不是有序，标记为false
                    isSorted = false;

                }
            }
            if (isSorted) break;
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


    //优化二：添加边界，分割有序区间和无序区间
    public static void doBubbleSort2(List<Integer> list) {
        int temp = 0;

        //记录最后一次交换的位置,默认为0
        int lastExchangeIndex = 0;
        //无需区域的边界，每次比较到这里为止,默认边界为最大下标
        int sortBorder = list.size() - 1;


        for (int i = 0; i < list.size(); i++) {
            //有序标记，每一轮的初始时true
            boolean isSorted = true;

            for (int j = 0; j < sortBorder; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    temp = list.get(j);

                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    //有元素交接，所以不是有序，标记为false
                    isSorted = false;
                    //记录当前交换位置
                    lastExchangeIndex = j;

                }
            }
            //重新设置边界下标
            sortBorder = lastExchangeIndex;
            if (isSorted) break;
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
