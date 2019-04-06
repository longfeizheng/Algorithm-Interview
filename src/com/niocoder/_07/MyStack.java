package com.niocoder._07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/4/6.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class MyStack {

    List<Integer> queue =  new ArrayList<Integer>();
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(0,x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove(0);
    }

    /** Get the top element. */
    public int top() {
        return queue.get(0);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
