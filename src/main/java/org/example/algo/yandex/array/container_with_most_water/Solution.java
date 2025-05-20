package org.example.algo.yandex.array.container_with_most_water;

//11. Container With Most Water
//Miro
class Solution {

    public static int maxArea(int[] height) {
        if (height==null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, countArea(height, left, right));

            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }

        return maxArea;
    }

    private static int countArea(int[] height, int left, int right) {
        return (right - left) * Math.min(height[left], height[right]);
    }
}
