package org.example.algo.yandex.anagrams.valid_anagram;

import static org.example.algo.yandex.anagrams.valid_anagram.Solution.isAnagramWithHashTable;

public class Test {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagramWithHashTable(s1, s2));
    }
}
