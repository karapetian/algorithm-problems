package org.example.algo.yandex.shortest_path_in_binary_matrix;

import static org.example.algo.yandex.shortest_path_in_binary_matrix.Solution.shortestPathBinaryMatrix;

public class Test {

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
