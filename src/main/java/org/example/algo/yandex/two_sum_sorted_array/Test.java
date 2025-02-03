package org.example.algo.yandex.two_sum_sorted_array;


import java.util.Arrays;

import static org.example.algo.yandex.two_sum_sorted_array.Solution.twoSum;

public class Test {
    public static void main(String[] args) {

        int[] input = {2,7,11,15};
        int target = 9;

//        int[] input = {2,3,4};
//        int target = 6;

//        int[] input = {-1,0};
//        int target = -1;

        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}
