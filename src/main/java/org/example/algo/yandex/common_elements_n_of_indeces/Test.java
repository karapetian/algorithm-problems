package org.example.algo.yandex.common_elements_n_of_indeces;

import java.util.Arrays;

import static org.example.algo.yandex.common_elements_n_of_indeces.Solution.findIntersectionValues;

public class Test {

    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 2, 1};
//        int[] arr2 = {2, 2};

//        int [] arr1 = {4,9,5};
//        int [] arr2 = {9,4,9,8,4};
        int [] arr1 = {4,9,5};
        int [] arr2 = {1,2};
        System.out.println(Arrays.toString(findIntersectionValues(arr1, arr2)));
    }
}
