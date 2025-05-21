package org.example.algo.practicum.yandex.sorting.merge_sorted_arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] input1 = new int[]{3, 5, 7, 8};
        int[] input2 = new int[]{1, 2, 4, 6};
        int[] ints = Solution.merge(input1, input2);
        System.out.println(Arrays.toString(ints));
    }
}
