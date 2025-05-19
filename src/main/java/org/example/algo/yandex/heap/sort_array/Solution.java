package org.example.algo.yandex.heap.sort_array;

import java.util.PriorityQueue;

//912. Sort an Array
//You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and
// with the smallest space complexity possible.
public class Solution {

    //Space compl O(n)
    //Time compl O(n log n)
    public static int[] sortArray(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.offer(num);  //nlgn
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.poll();  //n
        }

        return nums;
    }
}
