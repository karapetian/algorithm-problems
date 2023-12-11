package org.example.algo.remove_duplicates_from_sorted_array;

public class Test {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 3, 4}; //4
//        int[] input = {0,0,1,1,1,2,2,3,3,4}; //5
//        int[] input = {1,1,1}; //1
//        int[] input = {1,1}; //1
//        int[] input = {1,2}; //2
//        int[] input = {1,2,2}; //2

        int result = Solution.removeDuplicates(input);
        System.out.println(result);
    }
}
