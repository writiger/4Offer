package com.writiger.day_02.offer_35;

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        for (Node node = head; node != null; node = node.next.next) {
            Node nodeNew = new Node(node.val);
            nodeNew.next = node.next;
            node.next = nodeNew;
        }
        for (Node node = head; node != null; node = node.next.next){
            if(node.random != null)
                node.next.random = node.random.next;
            else
                node.next.random = null;
        }
        Node headNew = head.next;
        for(Node node = head; node != null; node = node.next){
            Node nodeNew = node.next;
            node.next = node.next.next;
            if(node.next != null)
                nodeNew.next = nodeNew.next.next;
            else
                nodeNew.next = null;
        }
        return headNew;
    }
}
