package org.example.algo.practicum.yandex.binary_search_2;

public class Test {

    public static void main(String[] args) {
        int [] testArray = new int[] {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1};
        // answer {0, 1} indexes-> 6, 7

        System.out.println(Solution.binarySearchSubArray(testArray));

    }
}
