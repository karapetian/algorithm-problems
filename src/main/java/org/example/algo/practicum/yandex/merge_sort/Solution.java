package org.example.algo.practicum.yandex.merge_sort;

//O(nlgn) -worst case
//Divide and concur
// Recursive algo
public class Solution {

    static int[] mergeSort(int[] input, int startIdx, int endIdx) {
        if (startIdx == endIdx) {
            return new int[]{input[startIdx]};
        }

        int mid = (endIdx + startIdx) / 2;
        int[] sub1 = mergeSort(input, startIdx, mid);
        int[] sub2 = mergeSort(input, mid + 1, endIdx);

        return org.example.algo.practicum.yandex.merge_sorted_arrays.Solution.merge(sub1, sub2);
    }
}