package com.niocoder._23;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementMain {
    public static void main(String[] args) {
        int i = majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(i);

    }

    /**
     * map
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) != null ? ((Integer) map.get(nums[i]) + 1) : 1);
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * 排序在判断
     *
     * @param nums
     * @return
     */
    public static int majorityElement1(int[] nums) {
        return 0;
    }
}
