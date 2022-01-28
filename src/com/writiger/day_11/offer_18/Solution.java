package com.writiger.day_11.offer_18;


public class Solution {
    public ListNode deleteNode(ListNode head,int val) {
        if(head.val == val)
            return head.next;

        ListNode pre = head;
        ListNode temp = pre.next;

        while(temp.next != null && temp.val != val) {
            pre = temp;
            temp = temp.next;
        }

        if(temp != null)
            pre.next = temp.next;
        return head;
    }
}
