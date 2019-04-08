package com.niocoder._16;

import java.util.*;

/**
 * Created on 2019/4/7.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class ThreeSumMain {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> lists = threeSum(nums);
        lists.forEach(e -> {
            e.forEach(i -> {
                System.out.print(i + " ");
            });
            System.out.println();
        });
    }


    /**
     * 三数之和
     *
     * 先排序 后查找
     * -4 -1 -1 0 1 2
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum + nums[i] == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(triplet);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum + nums[i] < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }
}
