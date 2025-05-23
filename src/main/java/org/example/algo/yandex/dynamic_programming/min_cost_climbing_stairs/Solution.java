package org.example.algo.yandex.dynamic_programming.min_cost_climbing_stairs;

public class Solution {

    //[10,15,20,6]
    public static int minCostClimbingStairs(int[] cost) {
        int starisCount = cost.length;
        int[] results = new int[starisCount+1];

        int prev1 = 0;
        int prev2 = 0;
        //as 2 <= cost.length <= 1000
        for (int i=2; i<starisCount+1; i++) {
            int var1 = prev1 + cost[i-1];
            int var2 = prev2 + cost[i-2];

            results[i] = Math.min(var1, var2);
            prev2 = prev1;
            prev1 = results[i];
        }
        return results[starisCount];
    }

    public static void main(String[] args) {
        int[] input = {10,15,20,6};
        System.out.println(minCostClimbingStairs(input));
    }
}
