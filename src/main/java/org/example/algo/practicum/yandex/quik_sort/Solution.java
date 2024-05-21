package org.example.algo.practicum.yandex.quik_sort;

//O(n) -worst case
//O(n lgn)
// Recursive algo
public class Solution {

    // take the rightest element as a pivot
    //take the first element (current & wall). If it is smaller than the pivot, leaf at its place
    //If it is bigger again leave it as later you will swap it with the firs (wall=input[0],  current=input[1])
    static int[] quickSort(int[] input, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            // Base case: subarray has zero or one element
            return input;
        }
        int pivot = input[endIdx];
        int currentIdx = startIdx;
        int wallIdx = startIdx;

        while (currentIdx < input.length) { // need to reach to the pivot
            if (input[currentIdx] <= pivot) {
                int tmp = input[wallIdx];
                input[wallIdx] = input[currentIdx];
                input[currentIdx] = tmp;

                wallIdx++;
                currentIdx++;
            } else {
                //wall remains the same
                currentIdx = currentIdx + 1;
            }
        }

        quickSort(input, startIdx, wallIdx - 2);
        quickSort(input, wallIdx, endIdx);
        return input;
    }
}
