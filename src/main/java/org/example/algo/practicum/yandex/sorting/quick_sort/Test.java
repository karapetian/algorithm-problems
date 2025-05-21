package org.example.algo.practicum.yandex.sorting.quick_sort;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] input = new int[]{3, 9, 1, 0, 4, 8, 7, 6, 2, 5};
        int[] ints = Solution.quickSort2(input, 0, input.length - 1);
        System.out.println(Arrays.toString(ints));
    }
}
