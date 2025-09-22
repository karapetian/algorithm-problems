package org.example.algo.yandex.strings.index_of_first_occurrence;

import static org.example.algo.yandex.strings.index_of_first_occurrence.Solution.strStr;

public class Test {

    public static void main(String[] args) {
//        String haystack = "sababutsad";
//        String needle = "sad";

        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(strStr(haystack, needle));
    }
}
