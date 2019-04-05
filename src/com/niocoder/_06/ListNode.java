package com.niocoder._06;

public class ListNode {
    ListNode next;
    int data;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }


    public static ListNode preData() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        return listNode1;
    }


    public static void print(ListNode listNode) {
        if (null != listNode) {
            System.out.println(listNode.data);
            print(listNode.next);
        }
    }
}
