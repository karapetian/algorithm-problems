package org.example.algo.practicum.yandex.insertion_sort;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] input = new int[]{3, 2, 1, 0, 4, 8, 7, 6, 9, 5};
        int[] ints = Solution.insertionSort(input);
        System.out.println(Arrays.toString(ints));
    }
}
