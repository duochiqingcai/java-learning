package com.dcqc.demo.学习笔记.数据结构和算法.算法;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @program: java-learning
 * @description 分治法:在每一轮挑选一个基准元素，并让其他比他大的元素移动至一边，比他小的到另一边，把数列拆解成两部分
 * 快排算法平均时间复杂度为O(nlogn)，最坏情况时间复杂度为O(n^2)(因为基准元素选择问题)
 * @author: duochiqingcai
 * @create: 2019-04-08 18:01
 **/
public class 快速排序1递归 {

    private final static Logger LOGGER = LoggerFactory.getLogger(快速排序1递归.class);

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 7, 7, 5, 9, 0, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //使用递归
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        //递归结束条件，startIndex>=endIndex
        if (startIndex >= endIndex) {
            return;
        }

        //得到基准元素位置
        int pivotIndex = partition(arr, startIndex, endIndex);
        
        //分治法递归基准元素前后部分数列
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);

    }

    //划分分区方法,默认使用下标为0元素作为基准元素，即startIndex=0,endIndex=arr.length()-1
    private static int partition(int[] arr, int startIndex, int endIndex) {
        //取第一个位置元素作为基准元素
        int pivot = arr[startIndex];

        int left = startIndex;
        int right = endIndex;

        //初始位置
        int index = startIndex;

        //
        while (right >= left) {
            //right指针从右向左比较
            while (right >= left) {
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }

            //left指针从左到右比较
            while (right >= left) {
                if (arr[left] > pivot) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = pivot;
        return index;
    }

}
