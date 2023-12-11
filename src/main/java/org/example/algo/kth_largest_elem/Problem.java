package org.example.algo.kth_largest_elem;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Problem {

    // n log(n) + n
    static int classicSort(int[] testArray, int k) {
        Arrays.sort(testArray); //quicksort - O(n log(n))
        return testArray[testArray.length - k]; //n
    }


    // MinHeap - a tree when each element is smaller or equal to its children.
    // After each insertion/deletion a heapifying process happens.
    // Solution: add elements to the heap until its size equals to k+1.
    // When the size reaches to k+1, remove the head node of the tree,
    // which is the smallest element at that time.
    // In the end the remaining head node is k-th largest element in array.
    // O( log(n) )
    static int withMinHeap(int[] testArray, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int e : testArray) {
            minHeap.add(e);
            if (minHeap.size() == k + 1) {
                minHeap.remove();
                //minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
