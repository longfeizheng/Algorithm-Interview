package com.niocoder._06;

/**
 * Created on 2019/4/5.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class ReverseKGroup {

    public static void main(String[] args) {
        ListNode listNode = ListNode.preData();
        ListNode.print(listNode);
        System.out.println("------------------");
        ListNode kGrougp = reverseKGroup(listNode, 2);
        ListNode.print(kGrougp);

    }


    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        ListNode check = head;
        int canProceed = 0;
        int count = 0;

        // 判断链表长度是否满足反转
        while (canProceed < k && check != null) {
            check = check.next;
            canProceed++;
        }

        // 满足条件则进行反转
        if (canProceed == k) {
            while (count < k && cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
                count++;
            }

            if (next != null) {
                head.next = reverseKGroup(next, k);
            }

            return pre;
        } else {
            return head;
        }
    }
}
