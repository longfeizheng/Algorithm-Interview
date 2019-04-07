package com.niocoder._12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2019/4/6.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class MaxSlidingWindowMain {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] ints = maxSlidingWindow(nums, 3);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (null == nums || nums.length == 0) {
            return new int[0];
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        int i = 0;
        for (int x : nums) {
            linkedList.add(x);
            i++;
            if (i == k) {
                break;
            }
        }

        List<Integer> list = new ArrayList<>();
        findMax(list, linkedList);

        for (int j = k; j < nums.length; j++) {
            linkedList.removeFirst();
            linkedList.add(nums[j]);
            findMax(list, linkedList);
        }

        int[] x = new int[list.size()];
        for (int j = 0; j < x.length; j++) {
            x[j] = list.get(j);
        }
        return x;
    }

    private static void findMax(List<Integer> list, LinkedList<Integer> linkedList) {
        int max = Integer.MIN_VALUE;
        for (int x : linkedList) {
            if(x > max) {
                max = x;
            }
        }
        list.add(max);
    }
}
