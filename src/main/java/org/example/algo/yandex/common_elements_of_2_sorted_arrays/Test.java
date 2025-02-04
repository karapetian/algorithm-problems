package org.example.algo.yandex.common_elements_of_2_sorted_arrays;

import static org.example.algo.yandex.common_elements_of_2_sorted_arrays.Solution.findIntersectionValues;

public class Test {
    public static void main(String[] args) {

//        int [] arr1 = {1,2,3,3,4};
//        int [] arr2 = {2,2,2,3,3,5,6};

        int[] arr1 = {2, 3, 3, 4};
        int[] arr2 = {1, 5};

//        int [] arr1 = {2,2,3};
//        int [] arr2 = {1,2};

        System.out.println(findIntersectionValues(arr1, arr2));
    }
}
