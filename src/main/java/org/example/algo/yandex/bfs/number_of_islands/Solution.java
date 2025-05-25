package org.example.algo.yandex.bfs.number_of_islands;

//[["1","1","0","0","0"],
// ["1","1","0","0","0"],
// ["0","0","1","0","0"],
// ["0","0","0","1","1"]]
//200. Number of Islands
public class Solution {

    public static int numIslands(char[][] grid) {
        int islandsCount = 0;

        if(grid==null || grid.length==0) {
            return islandsCount;
        }

        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j]=='1') {
                    islandsCount++;
                    findIslandBoarders(grid, i, j);
                }
            }
        }

        return islandsCount;
    }

    private static void findIslandBoarders(char[][] grid, int rowNum, int colNum) {
        if(rowNum<0 || rowNum>= grid.length
                || colNum<0 || colNum>= grid[0].length
                || grid[rowNum][colNum]=='2' || grid[rowNum][colNum]=='0') {
            return;
        }
        grid[rowNum][colNum]='2';
        findIslandBoarders(grid, rowNum+1, colNum);
        findIslandBoarders(grid, rowNum, colNum+1);
        findIslandBoarders(grid, rowNum-1, colNum);
        findIslandBoarders(grid, rowNum, colNum-1);
    }

    public static void main(String[] args) {
//        char [][] grid = {{'1','1','0','0','0'},
//                        {'1','1','0','0','0'},
//                        {'0','0','1','0','0'},
//                        {'0','0','0','1','1'}};

        char [][] grid = {{'1','1','1'},
                          {'0','1','0'},
                          {'1','1','1'}};
        System.out.println(numIslands(grid));
    }
}
