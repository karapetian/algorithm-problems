package org.example.algo.yandex.binarySearch_last_occurance;

public class Solution {

    //int [] input = {5,7,7,8,8,10};
    static int findLastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length; //for 2length array case

        while (end - start > 1) {
            int mid = (start + end) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return nums[start] == target ? start : -1;
    }
}
