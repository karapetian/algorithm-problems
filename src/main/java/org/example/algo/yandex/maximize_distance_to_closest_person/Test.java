package org.example.algo.yandex.maximize_distance_to_closest_person;

import static org.example.algo.yandex.maximize_distance_to_closest_person.Solution.maxDistToClosest;

public class Test {

    public static void main(String[] args) {
//        int[] input = {1, 0, 0, 0, 1, 0, 1};
        int[] input = {0, 0, 0, 0, 1, 0, 1};
//        int[] input = {1, 0, 0, 0, 0, 1};
//        int[] input = {1,0,0,0};
        System.out.println(maxDistToClosest(input));
    }
}
