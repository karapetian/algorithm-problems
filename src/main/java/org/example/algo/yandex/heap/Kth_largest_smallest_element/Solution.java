package org.example.algo.yandex.heap.Kth_largest_smallest_element;


import java.util.Comparator;
import java.util.PriorityQueue;

//215. Kth Largest Element in an Array
//Given an integer array nums and an integer k, return the kth largest element in the array.
//the idea is store K large elements
public class Solution {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() == k + 1) {
                queue.remove();
            }
        }

        return queue.peek();
    }

    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.add(num);
            if (queue.size() == k + 1) {
                queue.remove();
            }
        }

        return queue.peek();
    }
}
