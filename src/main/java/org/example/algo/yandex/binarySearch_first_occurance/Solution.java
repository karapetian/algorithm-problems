package org.example.algo.yandex.binarySearch_first_occurance;

//you have a sorted array find the First Occurrence of the target
//поиск первого вхождения
public class Solution {

    //int [] input = {5,7,7,8,8,10};
    static int findFirstOccurence(int[] nums, int target) {
        int start = -1; //for 2length array case
        int end = nums.length - 1;

        while (end - start > 1) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return nums[start] == target ? start : -1;
    }
}
