package org.example.algo.yandex.binary_search.binarySearch_last_occurance;

import static org.example.algo.yandex.binary_search.binarySearch_last_occurance.Solution.findLastOccurence;

public class Test {
    public static void main(String[] args) {
        int [] input = {5,7,7,8,8,10};
//        int [] input = {2,2};
        int target = 8;
//        int target = 6;
//        int target = 2;
//        int target = 7;
        System.out.println(findLastOccurence(input, target));
    }
}
