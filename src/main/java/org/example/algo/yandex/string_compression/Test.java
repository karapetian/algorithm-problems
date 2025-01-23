package org.example.algo.yandex.string_compression;

//Input: chars = ["a","a","b","b","c","c","c"]
//Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

import static org.example.algo.yandex.string_compression.Solution.compress;

//Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
public class Test {

    public static void main(String[] args) {
        char[] input = {'a','a','b','b','c','c','c'};
//        char[] input = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(input));

    }
}
