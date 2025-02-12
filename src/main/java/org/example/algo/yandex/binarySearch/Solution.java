package org.example.algo.yandex.binarySearch;

//704. Binary Search
//return the index
public class Solution {

    static int search(int[] nums, int target) {
        int start = 0; //here will be the solution
        int end = (nums.length - 1) +1; //+1 is for 2-length array!!!!

        while (end - start > 1) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return nums[start] == target ? start : -1;
    }
}
