package org.example.algo.yandex.merge_intervals;

import java.util.Arrays;

import static org.example.algo.yandex.merge_intervals.Solution.merge;

public class Test {

    public static void main(String[] args) {
//        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        int [][] intervals = {{1,3},{5,6}};
//        int [][] intervals = {{1,4},{2,3}};
//        int [][] intervals = {{5,10},{10, 11}};
        int [][] intervals = {{5,10},{12,18}, {15, 20}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
