package org.example.algo.yandex.array.remove_element;

//27. Remove Element
public class Solution {

    static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result ++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        System.out.println(removeElement(new int[]{2}, 3));
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }
}
