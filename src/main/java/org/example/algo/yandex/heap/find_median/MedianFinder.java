package org.example.algo.yandex.heap.find_median;

import java.util.Collections;
import java.util.PriorityQueue;

//295. Find Median from Data Stream
//The median is the middle value in an ordered integer list.
// If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.
//even number of elements: [1, 3, 5, 7] → Median = (3 + 5) / 2 = 4
//odd number of elements: [1, 3, 5] → Median = 3
//Both heaps have equal size (if k is even).
//The max-heap has 1 more element than the min-heap (if k is odd).
public class MedianFinder {

    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder()); //minheap
    private PriorityQueue<Integer> large = new PriorityQueue<>(); //maxheap
    private boolean isEven = true;

    public MedianFinder() {
    }

    public void addNum(int num) {
        if (isEven) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        isEven = !isEven;
    }

    public double findMedian() {
        if (isEven) {
            return (small.peek() + large.peek()) / 2.0;
        } else {
            return small.peek();
        }
    }
}
