package org.example.algo.yandex.Summary_Ranges;

//Input: nums = [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]

import static org.example.algo.yandex.Summary_Ranges.Solution.summaryRanges;

//Input: nums = [0,2,3,4,6,8,9]
//Output: ["0","2->4","6","8->9"]
public class Test {

    public static void main(String[] args) {
//        int[] ints = {0,1,2,4,5,7};
        int[] ints = {0,2,3,4,6,8,9};
//        int[] ints = {0,1,2,6};
        System.out.println(summaryRanges(ints));

    }
}
