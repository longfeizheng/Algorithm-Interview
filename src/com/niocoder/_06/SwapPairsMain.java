package com.niocoder._06;

public class SwapPairsMain {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode.print(listNode1);
        ListNode listNode = swapPairs(listNode1);
        System.out.println("--------------------------------");
        ListNode.print(listNode);
    }


    /**
     * 1->2->3->4
     * 2->1->4->3
     *
     * @param listNode
     * @return
     */
    public static ListNode swapPairs(ListNode listNode) {
        if (null == listNode || null == listNode.next) {
            return listNode;
        }
        // 辅助节点
        ListNode tempListNode = new ListNode(0);
        tempListNode.next = listNode;
        ListNode pre = tempListNode; // 辅助节点添加到链表中
        while (listNode != null && listNode.next != null) {
            ListNode temp = listNode.next;
            listNode.next = listNode.next.next;
            temp.next = listNode;
            pre.next = temp;
            pre = listNode;
            listNode = listNode.next;
        }
        return tempListNode.next;
    }
}
