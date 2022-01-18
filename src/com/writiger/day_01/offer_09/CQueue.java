package com.writiger.day_01.offer_09;

import java.util.Deque;
import java.util.LinkedList;

class CQueue {

    //int 和 Integer 区别

    //不推荐使用stack

    Deque<Integer> stack1;
    Deque<Integer> stack2;


    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            //如果栈2为空  将栈1倒入栈2  则栈2的栈顶为栈1的栈底  即待删除元素
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }else{
            return stack2.pop();
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
