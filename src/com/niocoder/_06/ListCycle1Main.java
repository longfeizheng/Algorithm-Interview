package com.niocoder._06;

public class ListCycle1Main {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node.next = node1;
        System.out.println(hasCycle(node));
    }


    public static ListNode hasCycle(ListNode head) {
        if (head == null) return null;
        ListNode fast, slow;
        fast = head;
        slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }

        if (fast.next == null || fast.next.next == null)
            return null;
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}