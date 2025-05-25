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
public class Solution2 {

    private static final int[][] neighboursCoordinates = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};


    static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0]!=0 || grid[grid.length-1][grid[0].length-1]!=0) {
            return Integer.MAX_VALUE;
        }

        grid[0][0]=1;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0,0});

        while (!queue.isEmpty()) {
            int[] firstCoordinate = queue.poll();

            //if we reached to the end
            if (firstCoordinate[0]==grid.length-1 && firstCoordinate[1]==grid[0].length-1) {
                return grid[grid.length-1][grid[0].length-1];
            }


            List<int[]> neighbours = getNeghbours(grid, firstCoordinate[0], firstCoordinate[1]);
            for (int[] n : neighbours) {
                int rowIdx = n[0];
                int colIdx = n[1];

//                if(grid[rowIdx][colIdx]==0) { //check in getNeghbours()
                    grid[rowIdx][colIdx] =  grid[firstCoordinate[0]][firstCoordinate[1]] + 1;
                    queue.add(n);
                }

        }


        return -1;
    }

    private static List<int[]> getNeghbours(int[][] grid, int row, int column) {
        return List.of();
    }
}
