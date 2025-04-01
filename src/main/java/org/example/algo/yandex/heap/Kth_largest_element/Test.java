package org.example.algo.yandex.heap.Kth_largest_element;

import static org.example.algo.yandex.heap.Kth_largest_element.Solution.findKthLargest;

//215. Kth Largest Element in an Array
//Given an integer array nums and an integer k, return the kth largest element in the array.
//Time Complexity: O(n log k) (since each heap operation takes O(log k)).
//Space Complexity: O(k) (for storing k elements in the heap).
public class Test {

    public static void main(String[] args) {

        int[] input = {3,2,3,1,2,6,4,5,5};
        System.out.println(findKthLargest(input, 4));
    }
}
