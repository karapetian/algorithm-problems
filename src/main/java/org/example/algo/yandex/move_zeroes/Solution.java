package org.example.algo.yandex.move_zeroes;

//283. Move Zeroes
//must do this in-place
//move all 0's to the end while maintaining the relative order of the non-zero elements.
public class Solution {

    //{0,1,0,3,12}
    //doesnt keep the order
    //wrong
    static void moveZeroes(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[end] == 0) {
                end--;
                continue;
            }
            if (nums[start] != 0) {
                start++;
                continue;
            }

            if (nums[start] == 0) {
                //swap
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;

                end--;
                start++;
            }
        }
    }

    // {0,1,0,3,12}
    static void moveZeroes3(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                //swap
                int tmp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = tmp;
                lastNonZeroFoundAt++;
            }
        }
    }
}
