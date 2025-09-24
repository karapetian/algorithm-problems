package org.example.algo.yandex.array.next_greater_element_3;

import java.util.Arrays;

//556. Next Greater Element III
public class Solution {

    static int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int len = digits.length;

        // Step 1: find pivot (first decreasing digit from the right)
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) return -1; // digits are in descending order

        // Step 2: find rightmost digit greater than pivot
        int j = len - 1;
        while (j > i && digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: swap pivot and this digit
        swap(digits, i, j);

        // Step 4: reverse suffix
        reverse(digits, i + 1, len - 1);

        // Step 5: convert back to number
        long result = Long.parseLong(new String(digits));
        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,3};
        System.out.println(nextGreaterElement(12343));
    }
}
