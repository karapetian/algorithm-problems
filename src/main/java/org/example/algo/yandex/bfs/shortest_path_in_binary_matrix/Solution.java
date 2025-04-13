package org.example.algo.yandex.bfs.shortest_path_in_binary_matrix;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//1091. Shortest Path in Binary Matrix
//Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix.
//A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1))
//All the visited cells of the path are 0.
//with BFS Algo
//        int[][] grid = {
//                {0, 0, 0},
//                {1, 1, 0},
//                {1, 1, 0}
//        };

//Time Complexity O(n2)
//Space Complexity: O(n2)
//Where Grid Size is n×n

//with BFS Algo
public class Solution {

    private static final int[][] directions =
            new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    static int shortestPathBinaryMatrix(int[][] grid) {
        // Firstly, we need to check that the start and target cells are open.
        if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) {
            return -1;
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0,0});
        grid[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] firstCell = queue.poll();

            if(firstCell[0] == grid[0].length-1 && firstCell[1]== grid.length-1) {
                return grid[firstCell[0]][firstCell[1]];
            }

            List<int[]> neighbours = getNeighbours(firstCell[0], firstCell[1], grid);
            for (int i = 0; i < neighbours.size(); i++) {
                int[] ints = neighbours.get(i);
                grid[ints[0]][ints[1]] = grid[firstCell[0]][firstCell[1]] + 1;
                queue.add(ints);
            }
        }

        // The target was unreachable.
        return -1;
    }

//new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    static List<int[]> getNeighbours(int row, int col, int[][] grid) {
        List<int[]> neighbours = new ArrayList<>();
        for (int i = 0; i < directions.length; i++) {
            int nRow = row + directions[i][0];
            int nCol = col + directions[i][1];
            if (nRow < 0 || nCol < 0 ||
                    nRow>=grid[0].length || nCol>=grid.length ||
                    grid[nRow][nCol] !=0) { //!!!
                continue;
            }
            neighbours.add(new int[]{nRow, nCol});
        }
        return neighbours;
    }
}
