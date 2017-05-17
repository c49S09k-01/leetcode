package com.csk.leetcode.LinkedList;

/**
 * Created by 24866 on 2017/5/16.
 * <p>
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveElements {

    //自己写的 AC 但是很繁琐
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            if (cur.val == val) {
                if (cur.next != null) {
                    cur.val = cur.next.val;
                    cur.next = cur.next.next;
                } else {
                    if (pre == null) head = null;
                    else pre.next = null;
                    return head;
                }
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    //别人的方法
    public ListNode removeElements_(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }

        ListNode cur = head;
        ListNode next = cur.next;

        while (next != null) {
            if (next.val == val) {
                cur.next = cur.next.next;
                next = cur.next;
            } else {
                cur = cur.next;
                next = next.next;
            }
        }
        return head;
    }
}
