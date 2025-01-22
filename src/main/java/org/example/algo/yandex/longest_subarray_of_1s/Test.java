package org.example.algo.yandex.longest_subarray_of_1s;

//Input: nums = [1,1,0,1]
//Output: 3

//Input: nums = [0,1,1,1,0,1,1,0,1]
//Output: 5

//Input: nums = [1,1,1]
//Output: 2
//N1493: Given a binary array nums, you should delete one element from it.
//Return the size of the longest non-empty subarray containing only 1's in the resulting array.
// Return 0 if there is no such subarray.
public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.longestSubarray(new int[]{1, 1, 1, 0, 1, 1, 0, 1}));
    }
}
