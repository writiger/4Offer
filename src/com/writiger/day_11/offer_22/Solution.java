package com.writiger.day_11.offer_22;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode ans = head, temp = head;
        for (int i = 1; i < k; i++)
            temp = temp.next;
        while (temp.next != null) {
            ans = ans.next;
            temp = temp.next;
        }
        return ans;
    }
}
