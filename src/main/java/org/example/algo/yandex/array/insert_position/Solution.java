package org.example.algo.yandex.array.insert_position;

//35. Search Insert Position
public class Solution {

    static int searchInsert(int[] nums, int target) {
        int startIdx = 0;
        int endIdx = nums.length - 1 + 1; //

        while (endIdx - startIdx > 1) { //
            int midIdx = startIdx + (endIdx - startIdx) / 2; //
            if (nums[midIdx] > target) {
                endIdx = midIdx; //
            } else {
                startIdx = midIdx; //
            }
        }

        if (target <= nums[0]) {
            return 0;
        }

        return nums[startIdx] == target ? startIdx : startIdx + 1;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
