package org.example.algo.yandex.array.missing_number;

import java.util.Arrays;
import java.util.LinkedList;

//268. Missing Number
public class Solution {

    //O(nlgn + n)
    public int missingNumber2(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) {
            return 1;
        }

        Arrays.sort(nums);

        int i = nums.length - 1;
        while (i >= 0 && nums[i] != i) {
            i--;
        }
        return (i < 0) ? 0 : i + 1;
    }

    //O(n)
    public int missingNumber(int[] nums) {
        int countOfNumbers = nums.length;
        int sum = countOfNumbers * (countOfNumbers + 1) / 2;

        for (int i = 0; i < countOfNumbers; i++) {
            sum = sum - nums[i];
        }

        return sum;
    }

    public static int missingNumberXor2(int[] nums) {
        LinkedList<Integer> xors = new LinkedList<>();
        xors.add(nums.length);

        for (int i = 0; i < nums.length; i++) {
            xors.offer(i ^ nums[i]);
        }
        int missingNum = xors.pop();
        while (!xors.isEmpty()) {
            missingNum = missingNum ^ xors.pop();
        }
        return missingNum;
    }

    public static int missingNumberXor(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] input = {1, 0, 3, 4};
        System.out.println(missingNumberXor2(input));
    }
}
