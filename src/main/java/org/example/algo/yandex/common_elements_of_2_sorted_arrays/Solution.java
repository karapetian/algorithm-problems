package org.example.algo.yandex.common_elements_of_2_sorted_arrays;

import java.util.ArrayList;
import java.util.List;

//Cannot find in LeetCode
public class Solution {

    static List<Integer> findIntersectionValues(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;

        int length = Math.max(nums1.length, nums2.length);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < length && p1 < nums1.length && p2 < nums2.length; i++) {
            if (nums1[p1] == nums2[p2]) {
                result.add(nums1[p1]);
                p2++;
                p1++;
                continue;
            }
            if (nums1[p1] > nums2[p2]) {
                p2++;
                continue;
            }
            if (nums1[p1] < nums2[p2]) {
                p1++;
            }
        }
        return result;
    }
}
