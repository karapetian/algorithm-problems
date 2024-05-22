package org.example.algo.practicum.yandex.insertion_sort;

//O(n2) - worst and average
//O(n) - best case - when tha array is almost sorted and you do only one iteration
public class Solution {

    static int[] insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (j > 0) {
                if (input[j] < input[j - 1]) {
                    int tmp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = tmp;
                    j--;
                } else {
                    break;
                }
            }
        }
        return input;
    }
}
