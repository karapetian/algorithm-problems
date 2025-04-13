package org.example.algo.yandex.maximize_distance_to_closest_person;

//N849: Maximize Distance to Closest Person
//You are given an array representing a row of seats
//where seats[i] = 1 represents a person sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty
//Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
//Return that maximum distance to the closest person.
public class Solution {
    //{1, 0, 0, 0, 1, 0, 1}
    static int maxDistToClosest(int[] seats) {
        int pointer = -1;
        int gap = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                continue;
            }
            //seats[i] == 1
            if (pointer == -1) {
                gap = i;
            } else {
                gap = Math.max(gap, (i - pointer) / 2);
            }
            pointer = i;
        }
        return Math.max(gap, (seats.length - 1 - pointer));
    }
}
