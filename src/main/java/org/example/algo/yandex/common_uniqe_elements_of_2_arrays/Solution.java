package org.example.algo.yandex.common_uniqe_elements_of_2_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//349. Intersection of Two Arrays
//Given two integer arrays nums1 and nums2, return an array of their intersection
//Each element in the result must be unique and you may return the result in any order.

//Approach 2: Sort 2 arrays and use 2 pointers. See org/example/algo/yandex/common_elements_of_2_arrays/Solution.java
public class Solution {

    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) {
            set1.add(n);
        }

        Set<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) {
            set2.add(n);
        }

        int[] result = new int[nums2.length];
        int num = 0;
        for (Integer i : set2) {
            if (set1.contains(i)) {
                result[num] = i;
                num++;
            }
        }
        return Arrays.copyOfRange(result, 0, num);
    }
}
