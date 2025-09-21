package org.example.algo.yandex.array.shuffle_array_easy;

import java.util.Arrays;

//1470. Shuffle the Array
public class Solution {

    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        for (int i=0; i<n; i=i+1) {
            result[2*i]=nums[i];
            result[2*i+1]=nums[n+i];
        }

        return result;
    }

    public static void main(String[] args) {
        int [] input = {2,5,1,3,4,7};
        int n = 3;
//2, 3, 5, 4, 1, 7
        System.out.println(Arrays.toString(shuffle(input, n)));
    }
}
