package org.example.algo.kth_largest_elem;


// find k-th largest element in array
public class Test {
    private static int[] testArray = {8, 2, 5, 3, 8, 2, 5, 0};

    private static int k = 6;

    public static void main(String[] args) {

        int classicSortResult = Problem.classicSort(testArray, k);

        int withMinHeapResult = Problem.withMinHeap(testArray, k);


        System.out.println("The results are equal: " +  (classicSortResult==withMinHeapResult));

    }
}
