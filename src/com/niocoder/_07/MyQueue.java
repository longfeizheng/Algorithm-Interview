package com.niocoder._07;

import java.util.Stack;

/**
 * Created on 2019/4/6.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int temp = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }

    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int temp = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

}
