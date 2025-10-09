package org.example.algo.adobe.sub_array_max_sum;

//53. Maximum Subarray
//Given an array. Find the max sum of elements in all sub-arrays.
public class Solution {

    static int findMaxSum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaxSum(arr));
    }
}
