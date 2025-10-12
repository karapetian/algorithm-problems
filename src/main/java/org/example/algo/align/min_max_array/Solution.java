package org.example.algo.align.min_max_array;

import java.util.Arrays;

//Given an array of integers, return the min and max.
public class Solution {

    static Integer[] findMinMax(Integer[] input) {
        int min = input[0];
        int max = input[0];

        for (int i = 1; i < input.length; i++) {
            min = Math.min(min, input[i]);
            max = Math.max(max, input[i]);
        }
        return new Integer[]{min, max};
    }

    public static void main(String[] args) {
        Integer[] input1 = {1, 2, 3, 5, 2, 9, 1, 7};
        System.out.println(Arrays.toString(findMinMax(input1)));
    }
}
