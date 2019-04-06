package com.niocoder._07;

import java.util.Stack;

/**
 * Created on 2019/4/5.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class BackspaceCompareMain {


    public static void main(String[] args) {
        System.out.println(backspaceCompare("xywrrmp", "xywrrmu#p"));
    }


    public static boolean backspaceCompare(String S, String T) {

        Stack<Character> s1 = compare(S);
        Stack<Character> t1 = compare(T);

        while (!s1.isEmpty() && !t1.isEmpty()) {
            if (!s1.pop().equals(t1.pop())) {
                return false;
            }
        }

        if (!s1.isEmpty() || !t1.isEmpty()) {
            return false;
        }

        return true;
    }

    public static Stack<Character> compare(String param) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < param.length(); i++) {
            char c = param.charAt(i);
            if ('#' == c) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack;
    }

}
