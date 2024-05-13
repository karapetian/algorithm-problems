package org.example.algo.practicum.yandex.binary_search_3;


public class Test {

    public static void main(String[] args) {
        int [] testArray = new int[] {0, 2, 4, 5, 6, 11};
        int target = 8;

        System.out.println(Solution.binarySearchMaxClosestElement(testArray, target));
    }
}
