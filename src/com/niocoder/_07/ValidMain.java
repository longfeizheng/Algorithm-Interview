package com.niocoder._07;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created on 2019/4/6.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class ValidMain {

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;

                if (!map.get(s.charAt(i)).equals(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}
