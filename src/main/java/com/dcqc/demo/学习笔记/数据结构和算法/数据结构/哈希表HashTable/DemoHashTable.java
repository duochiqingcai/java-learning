package com.dcqc.demo.学习笔记.数据结构和算法.数据结构.哈希表HashTable;

import java.util.Hashtable;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-22 13:38
 **/
public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1", "yihao");
        hashtable.put("2", "erhao");

        System.out.println(hashtable.hashCode() + hashtable.get("1") + " " + hashtable.get("2"));
    }
}
