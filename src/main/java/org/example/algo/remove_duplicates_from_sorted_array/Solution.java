package org.example.algo.remove_duplicates_from_sorted_array;


import java.util.Arrays;

public class Solution {
    public static int removeDuplicates_1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if(nums[0]==nums[nums.length-1]) {
            return 1;
        }

        int swaps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                swap(nums, i + 1);
                swaps++;
                if (nums[i] == nums[i + 1] && nums.length > 2) {
                    i--;
                }
            } else if (nums[i] > nums[i + 1]) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - swaps;
    }

    private static void swap(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            if (nums[index] <= nums[index + 1]) {
                int tmp = nums[index];
                nums[index] = nums[index + 1];
                nums[index + 1] = tmp;
                index++;
            }
        }
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return addIndex;
    }
}
