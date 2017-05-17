package com.csk.leetcode.LinkedList;

/**
 * Created by 24866 on 2017/5/16.
 *
 * Reverse a singly linked list.
 */
//  be af        be   af
//  1  2 3  -->  2  1 3
//  2 1
public class ReverseList {

    //第一种方法，可以把单链表里面的所有数按顺序取出来，然后再把这些数逆序插进单链表

    //第二种方法
    //别人的方法 多简单的方法 我怎么没想到
    public ListNode reverseList(ListNode head) {
    /* iterative solution */
        ListNode newHead = null;
            //头插入法
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public ListNode reverseList_1(ListNode head) {
    /* recursive solution */
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }

    //和我方法一致,变量结构一模一样 代码相似度 百分之 80, 但是我没做出来
    public ListNode reverseList_2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head.next;
        head.next = null;

        while (firstNode != null && secondNode != null) {

            ListNode temp = secondNode.next;
            secondNode.next = firstNode;
            firstNode = secondNode;

            if (temp != null) {
                secondNode = temp;
            } else {
                break;
            }
        }
        return secondNode;
    }
}
