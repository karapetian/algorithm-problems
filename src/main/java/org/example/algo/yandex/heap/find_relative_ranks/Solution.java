package org.example.algo.yandex.heap.find_relative_ranks;

import java.util.PriorityQueue;

//506. Relative Ranks
class Solution {
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[]{score[i], i});
        }

        int rank = 1;
        while (!maxHeap.isEmpty()) {
            int[] entry = maxHeap.poll();
            int originalIndex = entry[1];

            if (rank == 1) {
                result[originalIndex] = "Gold Medal";
            } else if (rank == 2) {
                result[originalIndex] = "Silver Medal";
            } else if (rank == 3) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(rank);
            }

            rank++;
        }

        return result;
    }
}