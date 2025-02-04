package org.example.algo.yandex.two_sum_less_that_K;

import static org.example.algo.yandex.two_sum_less_that_K.Solution.twoSumLessThanK;

public class Test {

    public static void main(String[] args) {

        int[] input = {34,23,1,24,75,33,54,8};
        int target = 60;

        System.out.println(twoSumLessThanK(input, target));

    }
}
