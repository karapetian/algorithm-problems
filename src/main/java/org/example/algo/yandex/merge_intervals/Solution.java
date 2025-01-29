package org.example.algo.yandex.merge_intervals;

import java.util.LinkedList;
import java.util.List;

//56. Merge Intervals
//{{1,3},{2,6},{8,10},{15,18}};
//O(nlgn) + O(n) complexity
//O(n) place complexity as of LinkedList
public class Solution {

    static int[][] merge(int[][] intervals) {

        if (intervals.length==1) {
            return intervals;
        }
        //sort the sub-arrays by their first element if they are not sorted - O(nlgn)
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> result = new LinkedList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.getLast();
            if (last[1] >= intervals[i][0]) {
                int[] merged = mergeArrays(last, intervals[i]);
                result.removeLast();
                result.add(merged);
            } else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    static int[] mergeArrays(int[] array1, int[] array2) {
        if (array2[0] <= array1[1] && array2[1] >= array1[1]) {
            return new int[]{array1[0], array2[1]};
        }
        if (array2[0] <= array1[1] && array2[1] <= array1[1]) {
            return array1;
        }
        return null;
    }
}
