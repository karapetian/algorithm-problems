package org.example.algo.squared_sorted_array;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
//        int [] input = {-4,-1,0,3,10};
        int [] input = {-7,-3,2,3,11};

        int[] sortedSquares = Solution.sortedSquares(input);

        System.out.println(Arrays.toString(sortedSquares));
    }
}
