package com.niocoder._15;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. set解决，
 * 2. map实现
 * Created on 2019/4/7.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class TwoSumMain {

    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 15};
        int[] ints = twoSum(arr, 7);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
