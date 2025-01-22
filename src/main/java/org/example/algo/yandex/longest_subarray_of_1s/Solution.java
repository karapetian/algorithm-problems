package org.example.algo.yandex.longest_subarray_of_1s;

//Approach: Sliding Window
//{1, 1, 1, 0, 1, 1, 0, 1}
class Solution {
    static int longestSubarray(int[] nums) {
        int numZero = 0;
        int left = 0;
        int maxWindowSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZero++;
                //continue;
            }
            while (numZero > 1) {
                if (nums[left] == 0) {
                    numZero--;
                }
                left++;
            }
            maxWindowSize = Math.max(maxWindowSize, i - left);
        }
        return maxWindowSize;
    }
}
