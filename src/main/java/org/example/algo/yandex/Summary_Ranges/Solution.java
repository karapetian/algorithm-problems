package org.example.algo.yandex.Summary_Ranges;


import java.util.ArrayList;
import java.util.List;

//N 228: You are given a sorted unique integer array nums.
//A range [a,b] is the set of all integers from a to b (inclusive).
//Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
//The numbers in ranges should be consecutive
// int[] ints = {0,1,2,5,7};
public class Solution {

//    static List<String> summaryRanges(int[] nums) {
//        List<String> result = new ArrayList<>();
//        if (nums.length == 0) {
//            return result;
//        }
//        int start = 0;
//        int end = 0;
//        for (int i = 1; i <= nums.length; i++) {
//            if (i == nums.length ||nums[i] - 1 != nums[i - 1]) {
//                result.add(buildStringFromArray(nums, start, end));
//                start = end = i;
//            } else {
//                end = i;
//            }
//        }
//        return result;
//    }
//
//    static String buildStringFromArray(int[] nums, int start, int end) {
//        if (start==end) {
//            return String.valueOf(nums[start]);
//        }
//        return nums[start] + "->" + nums[end];
//    }

    static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            // Keep iterating until the next element is one more than the current element.
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }

        return ranges;
    }
}
