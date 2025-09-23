package org.example.algo.practicum.yandex.sorting.quick_sort;

//O(n2) - worst case - when you always take the biggest/smallest as a pivot
//O(n lgn) - best case- when we always take the average element as pivot. In this case the 2 partitions will have equal sizes.
//O(n lgn) - average case- even though the 2 partitions will not be strictly equal, it will lead to O(n lgn)
// o(lgn) - space complexity - the maximum depth of the recursion tree is log n.
// This is the space required to store the call stack during the recursive calls
// Recursive algo
public class Solution {

    // take the rightest element as a pivot
    //take the first element (current & wall). If it is smaller than the pivot, leave at its place
    //If it is bigger again leave it, as later you will swap it with the first (wall=input[0],  current=input[1])
    static int[] quickSort(int[] input, int startIdx, int endIdx) {
        if (startIdx >= endIdx) { // !!!
            // Base case: subarray has zero or one element
            return input;
        }
        int pivot = input[endIdx];
        int currentIdx = startIdx;
        int wallIdx = startIdx;

        while (currentIdx < input.length) { // need to reach to the pivot
            if (input[currentIdx] <= pivot) {
                int tmp = input[wallIdx];
                input[wallIdx] = input[currentIdx];
                input[currentIdx] = tmp;

                wallIdx++;
                currentIdx++;
            } else {
                //wall remains the same
                currentIdx = currentIdx + 1;
            }
        }

        quickSort(input, startIdx, wallIdx - 2);
        quickSort(input, wallIdx, endIdx);
        return input;
    }

//good solution
    static int[] quickSort2(int[] input, int startIdx, int endIdx) {
        if (startIdx >= endIdx) { // !!!
            return input;
        }
        int pivot = input[endIdx];
        int wallIdx = startIdx;

        for (int currentIdx = startIdx; currentIdx < endIdx; currentIdx++) {
            if (input[currentIdx] <= pivot) {
                int tmp = input[wallIdx];
                input[wallIdx] = input[currentIdx];
                input[currentIdx] = tmp;

                wallIdx++;
            }
        }
        input[endIdx] = input[wallIdx];
        input[wallIdx] = pivot;

        quickSort2(input, startIdx, wallIdx - 1);
        quickSort2(input, wallIdx + 1, endIdx);
        return input;
    }
}
