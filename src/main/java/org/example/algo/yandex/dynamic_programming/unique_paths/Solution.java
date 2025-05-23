package org.example.algo.yandex.dynamic_programming.unique_paths;

//62. Unique Paths
public class Solution {

    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        for (int i = 0; i < grid.length; i++) {
            grid[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            grid[0][i] = 1;
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }

        }
        return grid[m - 1][n - 1];
    }


    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
}
