package com.writiger.day_01.offer_30;

import java.util.Deque;
import java.util.LinkedList;

class MinStack {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty() || stack2.peekFirst() >= x)
            stack2.push(x);
    }

    public void pop() {
        if(stack1.pop().equals(stack2.peekFirst()))
            stack2.pop();
    }

    public int top() {
        return stack1.peekFirst() == null ? -1 : stack1.peekFirst();
    }

    public int min() {
        return stack2.peekFirst() == null ? -1 : stack2.peekFirst();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */