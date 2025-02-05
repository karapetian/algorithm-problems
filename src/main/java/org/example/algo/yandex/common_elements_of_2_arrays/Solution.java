package org.example.algo.yandex.common_elements_of_2_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//350. Intersection of Two Arrays II
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
// appear as many times as it shows in both arrays and you may return the result in any order.
public class Solution {

    static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int[] result = new int[nums2.length];
        int num = -1;
        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                num++;
                result[num] = j;
                map.put(j, map.get(j) - 1);
            }
        }
        return Arrays.copyOfRange(result, 0, num + 1);
    }
}
