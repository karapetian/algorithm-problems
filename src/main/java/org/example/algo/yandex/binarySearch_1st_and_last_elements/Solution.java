package org.example.algo.yandex.binarySearch_1st_and_last_elements;

//34. Find First and Last Position of Element in Sorted Array
public class Solution {

    //поиск последнего вхождения
    static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int start = 0; //will keep the right-most occurrence of the target
        int end = nums.length;

        while (end - start > 1) {
            int mid = (start + end) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] != target) {
            return new int[]{-1, -1};
        }

        //now start is the last index of target, so lets go back till nums[i] is not equal to target
        end = start;
        for (int i = end - 1; i >= 0; i--) {
            if (nums[i] == target) {
                start--;
            } else {
                break;
            }
        }
        return new int[]{start, end};
    }
}
