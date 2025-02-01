package org.example.algo.yandex.squares_of_sorted_array;

//977. Squares of a Sorted Array
//Given an integer array nums sorted in non-decreasing order,
//return an array of the squares of each number sorted in non-decreasing order.
public class Solution {

    static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[i] = nums[start] * nums[start];
                start = start + 1;
            } else {
                result[i] = nums[end] * nums[end];
                end = end - 1;
            }
        }

        return result;
    }
}

