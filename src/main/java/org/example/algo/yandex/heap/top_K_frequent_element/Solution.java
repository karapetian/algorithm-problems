package org.example.algo.yandex.heap.top_K_frequent_element;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//347. Top K Frequent Elements
//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
public class Solution {

    //not optimal
    //O(n) + O(mlg(m)) + O(k)
    public static int[] topKFrequent2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, (v, n) -> v + 1);
        } //O(n)
        return map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) ////O(mlg(m))
                .limit(k) //O(k)
                .mapToInt(entry -> entry.getKey())
                .toArray();
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, (v, n) -> v + 1);
        } //O(n)

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> (e1.getValue() - e2.getValue()));
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            queue.add(integerIntegerEntry);
            if (queue.size() > k) {
                queue.poll();
            }
        } //O(nlg(n))

        return queue.stream().mapToInt(entry -> entry.getKey()).toArray();
    }
}
