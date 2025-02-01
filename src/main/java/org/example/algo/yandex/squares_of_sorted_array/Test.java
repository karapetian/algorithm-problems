package org.example.algo.yandex.squares_of_sorted_array;

import java.util.Arrays;

import static org.example.algo.yandex.squares_of_sorted_array.Solution.sortedSquares;

public class Test {

    public static void main(String[] args) {
//        int[] input = new int[]{-4, -1, 0, 3, 10};
    int[] input = new int[] {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(input)));
    }
}
