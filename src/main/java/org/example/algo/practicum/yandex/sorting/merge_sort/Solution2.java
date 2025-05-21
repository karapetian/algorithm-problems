package org.example.algo.practicum.yandex.sorting.merge_sort;


import java.util.Arrays;

public class Solution2 {

    static int[] sort(int[] input) {
        if (input == null || input.length == 1) {
            return input;
        }

        return mergeSortRecursion(input, 0, input.length - 1);
    }

    // 5 1 2 7
    private static int[] mergeSortRecursion(int[] input, int startIdx, int endIdx) {
        if (startIdx == endIdx) {
            return new int[]{input[startIdx]};
        }

        int midIdx = (startIdx + endIdx) / 2;
        int[] left = mergeSortRecursion(input, startIdx, midIdx);
        int[] right = mergeSortRecursion(input, midIdx + 1, endIdx);

        return mergeSortedArrays(left, right);
    }

    //check
    private static int[] mergeSortedArrays(int[] input1, int[] input2) {
        int resultLength = input1.length + input2.length;
        int[] result = new int[resultLength];
        int pointer1 = 0;
        int pointer2 = 0;

        int i = 0;
//        for (; i < resultLength && pointer1 < input1.length && pointer2 < input2.length; i++) {
        while (pointer1 < input1.length && pointer2 < input2.length) {
            if (input1[pointer1] < input2[pointer2]) {
                result[i] = input1[pointer1];
                pointer1++;
                i++;
            } else {
                result[i] = input2[pointer2];
                pointer2++;
                i++;
            }
        }

        while (pointer1 < input1.length) {
            result[i++] = input1[pointer1];
            pointer1++;
        }

        while (pointer2 < input2.length) {
            result[i++] = input2[pointer2];
            pointer2++;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] input = {5, 1, 2, 7};
        System.out.println(Arrays.toString(sort(input)));
    }
}
