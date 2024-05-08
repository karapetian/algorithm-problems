package org.example.algo.practicum.yandex.find_sum_in_array;

public class Test {

    public static void main(String[] args) {
        int [] testArray = new int[] {2, 4, 6, 3, 1, 3, 5};
        int target = 7;

        System.out.println(Solution.subarraySum(testArray, target));

        System.out.println(Solution.subarraySum(testArray, 5));

        System.out.println(Solution.subarraySum(new int[] {2, 4, 6, 3, 0, 3, 5}, 7));
    }
}
