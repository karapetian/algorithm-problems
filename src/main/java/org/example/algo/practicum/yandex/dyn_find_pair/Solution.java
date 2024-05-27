package org.example.algo.practicum.yandex.dyn_find_pair;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashSet;
import java.util.Set;

//given an array of numbers and you need to find a pair of numbers that are equal to the given target value.
//find Solution with O(n) complexity
public class Solution {

    static Pair<Integer, Integer> findPair(Integer[] input, int sum) {
        Set<Integer> set = new HashSet<>(Set.of(input));

        for (int element : input) {
            int numToFind = sum - element;
            if (set.contains(numToFind)) {
                return new ImmutablePair<>(element, numToFind);
            }
        }
        return null;
    }

    //Test
    public static void main(String[] args) {
        System.out.println(findPair(new Integer[]{3, 22, 5, 8, 2, 10}, 12));
    }
}
