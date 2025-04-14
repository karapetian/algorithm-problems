package org.example.algo.yandex.heap.top_k_frequent_words;

import static org.example.algo.yandex.heap.top_k_frequent_words.Solution.topKFrequent;

public class Test {

    public static void main(String[] args) {
        String [] input = {"i","love","leetcode","i","love","coding"};
        int k = 2;

        System.out.println(topKFrequent(input, k));

        input = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        k = 4;
        System.out.println(topKFrequent(input, k));
    }
}
