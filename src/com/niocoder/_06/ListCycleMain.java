package com.niocoder._06;

import java.util.HashSet;
import java.util.Set;

public class ListCycleMain {
    public static void main(String[] args) {
        ListNode listNode = ListNode.preData();
        System.out.println(hasCycle(listNode));
        System.out.println(hasCycle1(listNode));
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (null != head) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static boolean hasCycle1(ListNode head) {
        if (null == head || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
