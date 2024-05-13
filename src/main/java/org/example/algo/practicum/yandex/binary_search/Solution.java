package org.example.algo.practicum.yandex.binary_search;

//Есть упорядоченный массив целых чисел arr, нужно определить, есть ли в нём число X.
public class Solution {

    static boolean binarySearch(int[] arr, int target) {
        int leftIdx = 0;
        int rightIdx = arr.length;
        while (leftIdx < rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            if (arr[midIdx] == target) {
                return true;
            } else if (arr[midIdx] < target) {
                leftIdx = midIdx + 1;
            } else {
                rightIdx = midIdx;
            }
        }
        return false;
    }
}
