package com.csk.leetcode.LinkedList;

/**
 * Created by 24866 on 2017/5/16.
 *
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

 Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4
 after calling your function.
 */
public class DeleteNode {
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    //so easy
    // ... 别多想 只要求删除一个节点
    //以前见过类似的题目，解题方法很有意思
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
