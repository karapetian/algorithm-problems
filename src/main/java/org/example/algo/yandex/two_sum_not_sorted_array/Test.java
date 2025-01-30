package org.example.algo.yandex.two_sum_not_sorted_array;

import java.util.Arrays;

import static org.example.algo.yandex.two_sum_not_sorted_array.Solution.twoSum;

//1. Two Sum
//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
public class Test {

    public static void main(String[] args) {

//        int[] input = new int[] {2,7,11,15};
//        int target = 9;

//        int[] input = new int[] {3,2,4};
//        int target = 6;

        int[] input = new int[] {3,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}
