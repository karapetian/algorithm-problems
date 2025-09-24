package org.example.algo.yandex.linkedList.linkedList_reverse;

import java.util.Arrays;
import java.util.Stack;

public class Anna {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8};
        int[] result = findTheNextGreaterElement(arr);
        System.out.println("Next Greater Element Array:" + Arrays.toString(result));
    }

    public static int[] findTheNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

}
