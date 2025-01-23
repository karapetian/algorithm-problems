package org.example.algo.yandex.two_strings_identical_frequency_check;

import java.util.HashMap;

//You have  2 strings.
//Check if they have the same characters with the same number.
//Please write in java with O(n) complexity
public class Solution {

    //uses 1 hashMap
    static boolean haveSameCharacterFrequency(String str1, String str2) {
        // If lengths are different, they can't have the same frequencies
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count characters in the first string
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Subtract counts using the second string
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false; // Character not found in the first string
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c); // Remove character with zero count
            }
        }

        return charCountMap.isEmpty();
    }
}
