package org.example.algo.yandex.heap.top_K_frequent_element;

import java.util.Arrays;

import static org.example.algo.yandex.heap.top_K_frequent_element.Solution.topKFrequent;

public class Test {
    public static void main(String[] args) {

        int[] input = {1,1,1,2,2,3,2,4,3};

        System.out.println(Arrays.toString(topKFrequent(input, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[] {1}, 1)));

    }
}
