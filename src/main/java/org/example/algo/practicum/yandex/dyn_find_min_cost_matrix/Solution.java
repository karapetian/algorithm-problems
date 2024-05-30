package org.example.algo.practicum.yandex.dyn_find_min_cost_matrix;

//Given a cost matrix cost[][] and a position (M, N) in cost[][], write a function that returns cost of minimum cost
// path to reach (M, N) from (0, 0).
// You can only traverse down, right and diagonally lower cells from a given cell
//https://www.geeksforgeeks.org/min-cost-path-dp-6/
public class Solution {

    //minimum of 3 integers
    static int min(int x, int y, int z) {
        if (x < y)
            return (x < z) ? x : z;
        else
            return (y < z) ? y : z;
    }

    static int minCost(int cost[][], int m, int n) {
        if (n < 0 || m < 0)
            return Integer.MAX_VALUE;
        else if (m == 0 && n == 0)
            return cost[m][n];
        else
            return cost[m][n]
                    + min(
                    minCost(cost, m - 1, n - 1), //1, 1
                    minCost(cost, m - 1, n), //1, 2
                    minCost(cost, m, n - 1) //2, 1
            );
    }
}
