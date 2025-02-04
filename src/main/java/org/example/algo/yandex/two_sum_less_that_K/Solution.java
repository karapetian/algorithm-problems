package org.example.algo.yandex.two_sum_less_that_K;

import java.util.Arrays;

//1099. Two Sum Less Than K
//Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with
//nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.
public class Solution {

    static int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            if (start == end) {
                continue;
            }
            int sum = nums[start] + nums[end];

            if (sum < k) {
                max = Math.max(sum, max);
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}