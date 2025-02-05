package org.example.algo.yandex.common_elements_of_2_arrays;

import java.util.Arrays;

import static org.example.algo.yandex.common_elements_of_2_arrays.Solution.intersect;

public class Test {

    public static void main(String[] args) {

//        int [] arr1 = {4,3,2,3,1};
//        int [] arr2 = {2,2,5,2,3,6};

//        int [] arr1 = {3,4,2,3};
//        int [] arr2 = {1,5};

        int [] arr1 = {2,3,2};
        int [] arr2 = {1,2};

        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
}
