package com.dcqc.demo.基础.集合框架.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-24 20:04
 **/
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>(16);

        hashMap.put(1,"Yi");
        hashMap.put(2,"Er");
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.entrySet());

    }
}
