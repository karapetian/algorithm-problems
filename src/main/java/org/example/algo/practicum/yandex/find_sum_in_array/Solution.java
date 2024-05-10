package org.example.algo.practicum.yandex.find_sum_in_array;

import java.lang.reflect.Array;

//Определите, существует ли в массиве (with non_negative elements) такой непрерывный подмассив,
// что сумма его элементов равна X.
public class Solution {

    // O(n^2) complexity
    public static boolean subarraySum(int[] array, int target) {
        int leftIndex = 0;
        int rightIndex = 0;
        int sum = 0;

        while (rightIndex < array.length) {
            sum = sum + array[rightIndex];

            if (sum == target) {
                return true;
            }

            if (sum > target) {
                leftIndex = leftIndex + 1;
                rightIndex = leftIndex;
                sum = 0;
                continue;
            }

            rightIndex = rightIndex + 1;
        }

        return false;
    }


    // O(n) complexity
    public static boolean subarraySum2(int[] nonNegativeArr, int target) {
        int right = 0;
        int currentSum = 0;

        for (int left = 0; left < nonNegativeArr.length; left++) {
            // Recalculate the sum
            if (left > 0) {
                currentSum -= nonNegativeArr[left - 1];
            }

            // If necessary, move the right border
            while (right < nonNegativeArr.length && currentSum < target) {
                currentSum += nonNegativeArr[right];
                right++;
            }

            if (currentSum == target) {
                return true;
            }
        }
        return false;
    }
}
