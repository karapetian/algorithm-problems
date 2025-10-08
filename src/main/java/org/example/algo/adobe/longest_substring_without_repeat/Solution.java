package org.example.algo.adobe.longest_substring_without_repeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * For the given input string d find the longest substring(s) without any repeating characters.
 * The result string(s) return in an array. If more than one result is found
 * the order of substring in the array should correspond to the order of appearance in the input string.
 * <p>
 * For example, if the input is "Mary had a little lamb" the function should
 * return ["Mary h", "ry had", "e lamb"]
 */
public class Solution {

    public static String[] getLongestSubWithoutRepeat(String s) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }

        List<String> resultList = new ArrayList<>();
        char[] cahrsOfInput = s.toCharArray();

        int i = 0;
        int nextItemStartIdx = 0;
        int maxLength = 0;
        Map<Character, Integer> charLocationMap = new HashMap<>();
        while (i < cahrsOfInput.length) {
            char currentChar = cahrsOfInput[i];

            if(charLocationMap.containsKey(currentChar)) {
                String item = s.substring(nextItemStartIdx, i);
                maxLength = Math.max(item.length(), maxLength);
                if (item.length() >= maxLength) {
                    resultList.add(item);
                }
                i = nextItemStartIdx = charLocationMap.get(currentChar) + 1 ;
                charLocationMap = new HashMap<>();
            } else {
                charLocationMap.put(currentChar, i);
                i++;
            }
        }
        String lastItem = s.substring(nextItemStartIdx, i);
        maxLength = Math.max(lastItem.length(), maxLength);
        if (lastItem.length() >= maxLength) {
            resultList.add(lastItem);
        }

        int effFinalMaxLength = maxLength;
        String[] array = resultList.stream().sorted((a, b) -> a.length() - b.length())
                .filter(st -> st.length() == effFinalMaxLength)
                .toArray(String[]::new);
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLongestSubWithoutRepeat("Mary had a little lamb")));
    }
}
