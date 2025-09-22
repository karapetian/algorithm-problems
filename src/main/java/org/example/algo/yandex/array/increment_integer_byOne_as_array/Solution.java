package org.example.algo.yandex.array.increment_integer_byOne_as_array;

import java.util.LinkedList;

//66. Plus One
public class Solution {

    public static int[] plusOne1(int[] digits) {
        LinkedList<Integer> stack = new LinkedList<>();
        boolean increment = true;

        for (int i = digits.length - 1; i >= 0; i--) {
            int current = digits[i];
            if (increment) {
                current = current + 1;
                increment = false;
            }

            if (current == 10) {
                stack.push(0);
                increment = true;
            } else {
                stack.push(current);
            }
        }

        if (increment) {
            stack.push(1);
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }

    //Time and Space O(2n)
    public static int[] plusOne(int[] digits) {
        LinkedList<Integer> stack = new LinkedList<>();
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int current = digits[i] + carry;
            stack.push(current % 10);
            carry = current / 10;
        }

        if (carry > 0) {
            stack.push(carry);
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }

}
