package org.example.algo.yandex.meeting_rooms;

import static org.example.algo.yandex.meeting_rooms.Solution.minMeetingRooms;

public class Test {

    public static void main(String[] args) {

//        int[][] input = {{0, 10}, {15, 25}, {30, 40}}; //1
//        int[][] input = {{0, 30}, {5, 35}, {10, 40}}; //3
//        int[][] input = {{0, 10}, {5, 15}, {12, 20}}; //2
//        int[][] input = {{0, 10}, {10, 20}, {20, 30}}; //1
//        int[][] input = {{5, 10}, {0, 30}, {15, 20}}; //2
//        int[][] input = {{0, 100}, {10, 20}, {30, 40}, {50, 60}}; //2 //
        int[][] input = {{0, 30}, {5, 10}, {15, 20}}; //2

        System.out.println(minMeetingRooms(input));
    }


    // int[][] input = {{0, 100}, {10, 20}, {30, 40}, {50, 60}}; //2
    // Drow the diagram. We have 2 pointers, one on each array.
    // A meeting has started (0) before the ending of the erly ending meeting(20).
    // So we will need a room (counter++). The meeting can be either (0, 20) or any ther combinatin from the starting list (x, 20).
    // Then we move our pointer into the second element of the startingHours array.
    // 10 is smaller than 20, so we will need another room for the (10, x) meeting.
    // Then we move our pointer into the 3rd element of the startingHours array.
    //30 is bigger than 20, that means the (30, x) meeting has started when another meeting (x, 20) has already ended
    //so we dont need a new room and can reuse the old rooms.
    // Then we move our 2 pointers to the right.
    // Now we have a meeting (50, x) that has started after ending of (x, 40) meeting. So we won't need a new room.
}
