package org.example.algo.yandex.binarySearch_1st_and_last_elements;

import java.util.Arrays;

import static org.example.algo.yandex.binarySearch_1st_and_last_elements.Solution.searchRange;

public class Test {
    public static void main(String[] args) {
//        int [] input = {5,7,7,8,8,10};
        int [] input = {2,2};
//        int target = 8;
//        int target = 6;
        int target = 2;
//        int target = 7;
        System.out.println(Arrays.toString(searchRange(input, target)));
    }
}
