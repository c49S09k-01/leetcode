package com.csk.leetcode.LinkedList;

/**
 * Created by 24866 on 2017/5/16.
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Subs
 */
public class MergeTwoLists {

    //经过多次修改 终于 AC 虽然很繁琐 还是逻辑不强
    //和归并排序有点像
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val == l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur.next.next = l2;
                cur = cur.next.next;
                l2 = l2.next;
            } else if(l1.val > l2.val){
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            } else{
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
        }
        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
        return head.next;
    }

    //别人的代码
    public ListNode mergeTwoLists_(ListNode l1, ListNode l2) {
        //前两句话就比我前三句话精华 我服 感觉很有技巧性 学者点
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // l1->1->3->4->5
        // l2->2->6->7

        //递归 很好理解
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }


    }
}
