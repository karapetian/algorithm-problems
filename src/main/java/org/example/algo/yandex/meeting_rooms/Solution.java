package org.example.algo.yandex.meeting_rooms;

import java.util.Arrays;

//253. Meeting Rooms ||
//Miro
//If start[startPtr] < end[endPtr], it means:
//A new meeting is starting before the earliest one ends. So, no rooms have freed up yet, and you need an additional room.
//That’s why you increment the room counter.

// If start[startPtr] >= end[endPtr], it means:
//The earliest ending meeting is done.
//You can reuse that room, so you move endPtr forward (free that room).
public class Solution {

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        if (intervals.length == 1) {
            return 1;
        }

        int [] startingHours = new int [intervals.length] ;
        int [] endingHours = new int [intervals.length] ;
        for (int i = 0; i < intervals.length; i++) {
            startingHours[i] = intervals[i][0];
            endingHours[i] = intervals[i][1];
        }

        Arrays.sort(startingHours);
        Arrays.sort(endingHours);

        int roomCounter = 0;
        int endingHoursIndex = 0;
        for (int i = 0; i < startingHours.length; i++) {
            if(startingHours[i] < endingHours[endingHoursIndex]) {
                roomCounter++;
            } else {
                endingHoursIndex++;
            }
        }
        return roomCounter;
    }
}
