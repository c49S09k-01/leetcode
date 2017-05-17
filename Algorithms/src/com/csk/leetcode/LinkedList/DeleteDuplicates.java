package com.csk.leetcode.LinkedList;

/**
 * Created by 24866 on 2017/5/16.
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.

 Subscribe to see which compa
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head,next = head.next;
        while(next != null){
            if(current.val == next.val){
                current.next = next.next;
                next = current.next;
            }
            else{
                current = next;
                next = current.next;
            }
        }
        return head;
    }


    //也是自己写的 但是代码更简洁
    public ListNode deleteDuplicates_(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head;
        while(current.next != null){
            if(current.val == current.next.val)
                current.next = current.next.next;
            else current = current.next;
        }
        return head;
    }
}
