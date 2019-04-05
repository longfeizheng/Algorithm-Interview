package com.niocoder._06;

public class ReverseMain {
    public static void main(String[] args) {
        ListNode listNode = ListNode.preData();
        ListNode.print(listNode);
        System.out.println("--------------------------------");
        ListNode reverse = reverse(listNode);
        ListNode.print(reverse);
    }

    /**
     * 反转链表
     * 1->2->3->null
     * null<-1<-2-<3
     *
     * @param listNode
     * @return
     */
    public static ListNode reverse(ListNode listNode) {
        ListNode previous = null;
        while (listNode != null) {
            ListNode nextListNode = listNode.next;
            listNode.next = previous;
            previous = listNode;
            listNode = nextListNode;
        }
        return previous;
    }
}
