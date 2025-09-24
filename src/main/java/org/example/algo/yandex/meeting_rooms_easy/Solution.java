package org.example.algo.yandex.meeting_rooms_easy;

import java.util.Arrays;

//252. Meeting Rooms
//You are given an array of meeting time intervals. Your task is to determine whether a person can attend all the
// meetings without any time conflicts.
public class Solution {
    static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, ((a, b) -> Integer.compare(a[0], b[0]))); //Time: nlg(n) //Space: lg(n) - recursion

        for (int i = 0; i < intervals.length - 1; i++) { //Time: n
            if (intervals[i][1] <= intervals[i + 1][0]) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        int[][] input = {{7, 10}, {2, 4}, {8, 12}};
        int[][] input = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(canAttendMeetings(input));
    }
}
