package com.dcqc.demo.学习笔记.数据结构和算法.数据结构.树;

public class SearchBstree {
    private Node tree;

    public Node find(int data){
        Node p = tree;

        while(p !=null){
            if(data<p.data) p = p.left;
            else if(data>p.data) p = p.right;
            else return p;
        }
        return null;
    }


    public void insert(int data) {
        if (tree == null) {
            tree = new Node(data);
            return;
        }

        Node p = tree;
        while (p != null) {
            if (data > p.data) {
                if (p.right == null) {
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            } else { // data < p.data
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }

    public static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node (int data){
            this.data = data;
        }
    }
}
