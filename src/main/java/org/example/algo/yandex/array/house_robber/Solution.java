package org.example.algo.yandex.array.house_robber;

//198. House Robber
//Miro
//DP
//https://www.youtube.com/watch?v=CCuHIYK04jE&t=171s
public class Solution {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] stepResults = new int[nums.length]; //an array that will keep the max result of the each step
        stepResults[0] = nums[0];
        stepResults[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i ++) {
            stepResults[i] = Math.max(stepResults[i-1], (nums[i]+stepResults[i-2]));
        }

        return stepResults[nums.length-1];
    }
}
