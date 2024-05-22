package org.example.algo.practicum.yandex.merge_sorted_arrays;

//Merge 2 Sorted Arrays
// O(n+m)
public class Solution {

    public static int[] merge(int[] input1, int[] input2) {
        int resultLenght = input1.length + input2.length;
        int[] result = new int[resultLenght];

        int input_1_pointer = 0;
        int input_2_pointer = 0;
        int i = 0;

        for ( ;
             0 < resultLenght && (input_1_pointer != input1.length && input_2_pointer != input2.length);
             i++) {
            if (input1[input_1_pointer] < input2[input_2_pointer]) {
                result[i] = input1[input_1_pointer];
                input_1_pointer++;
            } else {
                result[i] = input2[input_2_pointer];
                input_2_pointer++;
            }
        }

        while (input_1_pointer < input1.length) {
            result[i++] = input1[input_1_pointer++];
        }

        while (input_2_pointer < input2.length) {
            result[i++] = input2[input_2_pointer++];
        }

        return result;
    }
}