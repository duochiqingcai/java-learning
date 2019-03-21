package com.dcqc.demo.数据结构和算法.链表;

/**
 * @program: java-learning
 * @description 引用变量
 * @author: duochiqingcai
 * @create: 2019-03-20 23:05
 **/
public class 单链表逆序 {


    public static void main(String[] args) {
        //初始化链表
        Node head = new Node(1);
        head.next = new Node(2);

        Node temp = head.next;
        temp.next = new Node(3);

        temp = temp.next;
        temp.next = new Node(4);

        temp = temp.next;
        temp.next = new Node(5);

        //逆序前输出链表
        temp = head;
        System.out.println("逆序之前：");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        //逆序链表,然后返回新链表的头结点
        head = reverseLinkedList(head);

        //逆序后输出链表
        temp = head;
        System.out.println("逆序之后：");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    private static Node reverseLinkedList(Node head) {
        //判断是否为空链表
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        Node mid = head.next;
        Node behind = null;

        while (mid != null) {
            behind = mid.next;
            mid.next = prev;

            //将结点引用变量向后平移
            prev = mid;
            mid = behind;
        }

        //将最后一个结点指向null，头结点head=prev
        head.next = null;
        head = prev;

        return head;
    }

    //单链表逆序的方法一:迭代遍历法
//    public static void reverseListIterative(Node head) {
//        System.out.println(head.next.next.data);
//        Node prev = null; //前指针节点
//        Node curr = head; //当前指针节点
//
//        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
//        while (curr != null) {
//            Node nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
//            curr.next = prev; //将当前节点指向它前面的节点
//            prev = curr; //前指针后移
//            curr = nextTemp; //当前指针后移
//        }
//
//    }

    //Node内部类
    private static class Node {
        //结点中的数据
        int data;

        //指向的下一个结点，即next指针
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
