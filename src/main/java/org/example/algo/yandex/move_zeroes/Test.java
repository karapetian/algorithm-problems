package org.example.algo.yandex.move_zeroes;

import java.util.Arrays;

import static org.example.algo.yandex.move_zeroes.Solution.moveZeroes3;

public class Test {

    public static void main(String[] args) {
        int [] nums = {4,0,1,0,3,12};

        moveZeroes3(nums);
        System.out.println(Arrays.toString(nums));
    }
}
