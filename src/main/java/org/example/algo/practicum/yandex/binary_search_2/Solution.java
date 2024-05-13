package org.example.algo.practicum.yandex.binary_search_2;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

//Задача: дана бинарная строка длины 𝑁 состоящая только из нулей и единиц. Гарантируется, что самый левый её элемент 0, а
//самый правый — 1. Найдите любое вхождение подстроки “01”.
// each sub-array should start with 0 and end with 1.
//find the smallest sub-array that starst with 0 and ends with 1.
public class Solution {

    static Pair<Integer, Integer> binarySearchSubArray(int[] arr) {
        int startIndx = 0;
        int endIndx = arr.length - 1;
        int mid = (arr.length - 1) / 2;

        while (startIndx < endIndx) {
            if (endIndx - startIndx == 1) { // When startIndx and endIndx are next to each other
                break;
            }
            if (arr[startIndx] == 0 && arr[mid] == 1) {
                endIndx = mid;
                mid = (startIndx + endIndx) / 2;
            } else if (arr[mid] == 0 && arr[endIndx] == 1) {
                startIndx = mid;
                mid = (startIndx + endIndx) / 2;
            }
            if (arr[startIndx] == 0 && arr[endIndx] == 1 && endIndx - startIndx == 1) { // When startIndx and endIndx are next to each other
                break;
            }
        }

        return new ImmutablePair<>(startIndx, endIndx);
    }
}
