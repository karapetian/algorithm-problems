package org.example.algo.adobe.non_decreasing_array;

/**
 * Determine if it is possible to make the input array non-decreasing
 * (so that each element is greater than or equal to the previous one)
 * by changing only one element of the array or making no changes at all.
 * Example: the input array [1, 4, 3, 3] can be made non-decreasing changing the element under index 1 from 4 to 1, 2 or 3.
 **/
public class Solution {

    static boolean isPossibleToMakeNotDecreasing(int[] input) {
        int numOfMutation = 0;
        for (int j = 0; j < input.length - 1; j++) {
            if (input[j] > input[j + 1]) {

                numOfMutation++;
                if (numOfMutation > 1) {
                    return false;
                }

                if (j == 0 || input[j - 1] <= input[j + 1]) { //if leftValue <= rightValue
                    input[j] = input[j + 1]; // rightValue
                } else {
                    input[j+1] = input[j];
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isPossibleToMakeNotDecreasing(new int[]{1, 4, 3, 3}));
        System.out.println(isPossibleToMakeNotDecreasing(new int[]{1, 5, 3, 6}));
//        System.out.println(isPossibleToMakeNotDecreasing(new int[]{4, 2, 3}));
//        System.out.println(isPossibleToMakeNotDecreasing(new int[]{3, 4, 2, 3})); //false
    }
}
