package org.example.algo.yandex.anagrams.valid_anagram;

import java.util.Arrays;
import java.util.HashMap;

//242. Valid Anagram
//s and t consist of lowercase English letters.
//Another option is `return sorted(s) == sorted(t)` - 2n * lg(n)
public class Solution {

    //O(n)
    //Память: O(1) (массив фиксированного размера)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] lettersCount = new int[26];
        for (char c : s.toCharArray()) {
            int charAsInt = c - 'a';
            lettersCount[charAsInt] = lettersCount[charAsInt] + 1;
        }

        for (char c : t.toCharArray()) {
            int charAsInt = c - 'a';
            lettersCount[charAsInt] = lettersCount[charAsInt] - 1;
        }

        return Arrays.equals(lettersCount, new int[26]);
    }

    //slower
    public static boolean isAnagramWithHashTable(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.merge(c, 1, (oldVal, newVal) -> oldVal + 1);
        }

        for (char c : t.toCharArray()) {
            Integer charCount = charCountMap.get(c);
            if (charCount == null) {
                return false;
            }
            charCount = charCount - 1;
            if (charCount < 0) {
                return false;
            }
            charCountMap.put(c, charCount);
        }

        return true;
    }
}
