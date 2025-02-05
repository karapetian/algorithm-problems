package org.example.algo.yandex.common_elements_n_of_indeces;

import java.util.HashSet;

//2956. Find Common Elements Between Two Arrays
//You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:
//answer1 : the number of indices i such that nums1[i] exists in nums2.
//answer2 : the number of indices i such that nums2[i] exists in nums1.
public class Solution {

    static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int count1 = 0, count2 = 0;
        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }

        for (int i : nums1) {
            if (set2.contains(i)) count1++;
        }

        for (int i : nums2) {
            if (set1.contains(i)) count2++;
        }

        int[] result = new int[2];
        result[0] = count1;
        result[1] = count2;
        return result;
    }
}
