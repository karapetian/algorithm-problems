package org.example.algo.practicum.yandex.sorting.quick_sort;

import java.util.Arrays;

//O(n2) - worst case - when you always take the biggest/smallest as a pivot
//O(n lgn) - best case- when we always take the average element as pivot. In this case the 2 partitions will have equal sizes.
//O(n lgn) - average case- even though the 2 partitions will not be strictly equal, it will lead to O(n lgn)
// o(lgn) - space complexity - the maximum depth of the recursion tree is log n.
// This is the space required to store the call stack during the recursive calls
// Recursive algo
public class Solution2 {
    static int[] sort(int[] input) {
        if (input == null) {
            return input;
        }
        return quickSortRecurse(input, 0, input.length - 1);
    }

    static int[] quickSortRecurse(int[] input, int startIdx, int endIdx) {
        if (endIdx <= startIdx) {
            return input;
        }

        int pivot = endIdx;
        int wallIndx = startIdx;

        for (int i = startIdx; i < endIdx; i++) {
            if (input[i] <= input[pivot]) {
                //swap
                int tmp = input[wallIndx];
                input[wallIndx] = input[i];
                input[i] = tmp;

                wallIndx++;
            }
        }
        //swap wallIndx and pivot
        int tmp = input[wallIndx];
        input[wallIndx] = input[pivot];
        input[pivot] = tmp;


        quickSortRecurse(input, startIdx, wallIndx - 1);
        quickSortRecurse(input, wallIndx + 1, endIdx);
        return input;
    }


    public static void main(String[] args) {
        int[] input = new int[]{3, 9, 1, 0, 4, 8, 7, 6, 2, 5};
//        int[] input = new int[]{5, 23, 8, 6};
        int[] ints = sort(input);
        System.out.println(Arrays.toString(ints));
    }

}
