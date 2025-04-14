package org.example.algo.yandex.heap.top_k_frequent_words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//692. Top K Frequent Words
public class Solution {

    // Overall - O(nlgn)
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> stringsCountMap = new HashMap<>();

        for (String word : words) {
            stringsCountMap.merge(word, 1, (oldVal, newVal) -> oldVal + newVal); //O(n)
        }

        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((e1, e2) ->
                e1.getValue().equals(e2.getValue()) ? e2.getKey().compareTo(e1.getKey()) : (e1.getValue() - e2.getValue()));

        for (Map.Entry<String, Integer> stringIntegerEntry : stringsCountMap.entrySet()) {
            queue.offer(stringIntegerEntry);
            if (queue.size() > k) {
                queue.poll();
            }
        } //O(nlgn)

        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().getKey()); //O(n)
        }
        Collections.reverse(result); //O(n)
        return result;
    }
}
