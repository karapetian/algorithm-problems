package org.example.algo.yandex.binarySearch_find_root_square;

//69. Sqrt(x)
//Given a non-negative integer x, return the square root of x rounded down to
// the nearest integer. The returned integer should be non-negative as well.
public class Solution {

    static int mySqrt(int x) {
        int start = 0;
        long end = (long)x + 1; //solution will be here

        while (end - start > 1) {
            long mid = (end + start) / 2;
            if (mid * mid <= x) {
                start = (int) mid;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
