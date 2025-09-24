package org.example.algo.yandex.array.next_greater_element_2;

import java.util.Arrays;
import java.util.Stack;

//503. Next Greater Element II
public class Solution {

    static int[] nextGreaterElements(int[] nums) {
        int[] result =new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.empty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(nums1)));
    }
}
