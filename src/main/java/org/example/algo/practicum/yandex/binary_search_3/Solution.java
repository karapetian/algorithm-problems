package org.example.algo.practicum.yandex.binary_search_3;

//дан упорядоченный массив arr и число X, нужно найти индекс максимального элемента arr, не превосходящего X.
// Если такого элемента не существует, вернуть -1.
public class Solution {

    //{0, 2, 4, 5, 6, 11}
    static int binarySearchMaxClosestElement(int[] arr, final int target) {
        int startIndx = 0;
        int endIndx = arr.length - 1;
        int mid = arr.length / 2;

        if (arr[0] > target) {
            return -1;
        }

        while (startIndx + 1 < endIndx) { // startIndx + 1 !!!
            if (arr[mid] <= target) {
                startIndx = mid;
                mid = (startIndx + endIndx) / 2;
            } else {
                endIndx = mid;
            }
        }
        return arr[mid];
    }
}
