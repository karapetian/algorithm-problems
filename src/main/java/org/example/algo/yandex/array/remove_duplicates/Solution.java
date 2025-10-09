package org.example.algo.yandex.array.remove_duplicates;

import java.util.HashSet;
import java.util.Set;

//26. Remove Duplicates from Sorted Array
public class Solution {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int counter = 1; // first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }

    //wrong
    static int removeDuplicates_wrong(int[] nums) {
        int counter = 0;
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i=0; i< nums.length-1; i++) {
            if (!uniqueNums.contains(nums[i])) {
                uniqueNums.add(nums[i]);
                counter ++;
            } else {
                nums[i] = nums[i+1];
            }
        }
        return counter;
    }

    public static void main(String[] args) {
//        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 2, 2}));
//        System.out.println(removeDuplicates(new int[]{0, 1, 2, 3}));
    }
}
