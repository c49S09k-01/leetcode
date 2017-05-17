package com.csk.leetcode.LinkedList;

/**
 * Created by 24866 on 2017/5/16.
 *
 * Given a linked list, determine if it has a cycle in it.
 */


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class HasCycle {

    //自己写的 AC
    public boolean hasCycle(ListNode head) {
        ListNode first = head,second = head;
       while(first != null && second != null && second.next != null) {
           first = first.next;
           second = second.next.next;
           if (first == second)
               return true;
       }
        return false;
    }

    //别人的 算法更加细腻
    public boolean hasCycle_(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        //比我改进的地方，只需要判断 runner 就行，因为 runner 走的更快
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
