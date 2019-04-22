package com.dcqc.demo.学习笔记.基础.String;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-11 14:48
 **/
public class DemoString {
    public static void main(String[] args) {
        //字面量创建String，直接在字符串常量池中创建，只创建了1个
        String s1 = "abc";
        String s2 = "abc";
        //比较是否同一个对象
        System.out.println(s1 == s2);

        //new，在堆中创建，创建了
        String s3 = new String("xyz");
        String s4 = new String("xyz");
        String s5 = "xyz";
        //==比较是否同一个对象（内存地址是否相同）
        System.out.println(s3 == s4);
        //equals比较对象内容是否相同
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s5);
        System.out.println(s3.equals(s5));

        String s6 = new String("a") + new String("b");
        String s7 = "ab";
        String s8 = s6.intern();
        System.out.println(s6 == s7);
        System.out.println(s6 == s8);
    }
}
