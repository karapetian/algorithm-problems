package org.example.algo.yandex.dynamic_programming.climb_stairs;

//70. Climbing Stairs
//DP
//To reach step n, there are only two ways you could have gotten there:
//You were on step n - 1 and took 1 step
//You were on step n - 2 and took 2 steps
//The number of ways to get to step n - 1 is ways(n - 1)
//The number of ways to get to step n - 2 is ways(n - 2)
//Add them together, and you get all the possible paths to reach step n
public class Solution {

    // Time - O(2^n) Space - O(n)
    public int climbStairsComplex(int n) {
        if (n <= 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    //Time O(n) Space O(1)
    public int climbStairs(int n) {
        if (n<=3) {
            return n;
        }

        int result = 0;
        int prev1 = 3;
        int prev2 = 2;
        for (int i = 4; i<=n; i++) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }

        return result;
    }
}
