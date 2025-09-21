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

    static int solution(int[] input, int k) {
        int length = input.length;
        if (input.length < 2) {
            return -1;
        }

        Arrays.sort(input); //nlgn

        int leftIdx = 0;
        int rightIdx = length-1;
        int result = -1;
        while (leftIdx<rightIdx) {  //n
            int sum = input[leftIdx] + input[rightIdx];
            if (sum < k) {
                result =  Math.max(result, sum);
                leftIdx ++;
            } else  {
                rightIdx -- ;
            }

        }
        return result;
    }
}