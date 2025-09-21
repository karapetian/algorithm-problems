package org.example.algo.yandex.two_sum_not_sorted_array;

import java.util.HashMap;

//We can have O(n2) TC and O(1) SC if we do 2inner for-s
// 1. Two Sum
public class Solution {

    //not sorted array
    //return the indices
    // O(n) time complexity
    // O(n) space complexity
    static int[] twoSum(int[] nums, int target) {
        //key - num; value - index
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.containsKey(target - nums[i])) {
                return new int[]{set.get(target - nums[i]), i};
            }
            set.put(nums[i], i);
        }
        return null;
    }
}
