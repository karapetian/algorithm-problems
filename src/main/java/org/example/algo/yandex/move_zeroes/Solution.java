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

    //{0,1,0,3,12}
    //{5, 4, 0,1,0,3,12}
    //{5, 4, 1,0,0,3,12}
    static void moveZeroes2(int[] nums) {
        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[pointer1] != 0 && nums[pointer2] != 0) {
                pointer1++;
                pointer2++;
                continue;
            }

            if (nums[pointer2] == 0) {
                do {
                    pointer2++;
                } while (nums[pointer2] != 0);

                //swap
                int tmp = nums[pointer1];
                nums[pointer1] = nums[pointer2];
                nums[pointer2] = tmp;

                pointer1++;
                pointer2++;
            }
        }
    }

    // {4, 0,1,0,3,12}
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


    // {4,5,0,1,0,3,12}
    // {4, 0, 3, 5}
    static void moveZeroes4(int[] nums) {
        if (nums.length==1) {
            return;
        }
        int left = 0; //to find zeroes
        int right = 1; //to find non-zeroes

        while (right < nums.length) {
            if (nums[left] != 0) {
                left++;
                right++;
                continue;
            }
            if (nums[right] == 0) {
                right++;
                continue;
            }
            if (nums[right] != 0 && nums[left] == 0) {
                //swap
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;

                right++;
                left++;
            }
        }

    }
}
