package org.example.algo.yandex.two_sum_sorted_array;

//167. Two Sum II - Input Array Is Sorted
//Return the indices of the two numbers, index1 and index2, added by one
public class Solution {

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
//            if (end > target) {  //doesnt work wit negative numbers
//                end--;
//                continue;
//            }
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{start+1, end+1}; //as per requrment
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return null;
    }

    static int[] solution(int[] input, int target) {

        int leftIdx = 0;
        int rightIdx = input.length - 1;

        while (leftIdx < rightIdx) {
            int sum = input[leftIdx] + input[rightIdx];
            if (sum == target) {
                return new int[] {leftIdx+1, rightIdx+1};
            }
            if (sum > target) {
                rightIdx -- ;
            } else {
                leftIdx ++;
            }
        }

        return null;
    }
}
