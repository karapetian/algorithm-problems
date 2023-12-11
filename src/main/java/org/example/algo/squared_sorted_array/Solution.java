package org.example.algo.squared_sorted_array;

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of
// each number sorted in non-decreasing order.
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
public class Solution {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        //pick the 1st and last indexes
        int start = 0;
        int end = nums.length - 1;

        for (int i = nums.length - 1; i >=0 ; i--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[i] = nums[start] * nums[start];
                start++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }
        }
        return result;
    }
}
