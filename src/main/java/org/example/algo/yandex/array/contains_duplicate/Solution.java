package org.example.algo.yandex.array.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

//217. Contains Duplicate
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();

        for (int i = 0; i<nums.length; i++) {
            if(map.contains(nums[i])) {
                return true;
            } else {
                map.add(nums[i]);
            }
        }
        return false;
    }
}
