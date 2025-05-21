package org.example.algo.practicum.yandex.sorting.merge_sort;

import java.util.Collections;

//O(nlgn) in both the average and worst cases.
//Devide - takes lgn complexity
//Concur - the merging of all sublists into a single list takes O(N) time, because
// it needs to iterate through the elements of the two sub-arrays to merge them.
// Total Time Complexity: Since the divide step is performed log n times, and the conquer step takes linear time O(n)
// for each level of the recursion tree, the total time complexity is O(n log n).
// The space complexity of Merge sort is O(n).
//Divide and concur
// Recursive algo
//idea of breaking down a list into several sub-lists until each sublist consists of a single element and merging
// those sublists in a manner that results into a sorted list.
public class Solution {

    static int[] mergeSort(int[] input, int startIdx, int endIdx) {
        if (startIdx == endIdx) {
            return new int[]{input[startIdx]};
        }

        int mid = (endIdx + startIdx) / 2;
        int[] sub1 = mergeSort(input, startIdx, mid);
        int[] sub2 = mergeSort(input, mid + 1, endIdx);

        return org.example.algo.practicum.yandex.sorting.merge_sorted_arrays.Solution.merge(sub1, sub2);
    }
}