package org.example.algo.yandex.dynamic_programming.word_break;

import java.util.*;

//139. Word Break
public class Solution {
    public static boolean wordBreak2(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);

        // dp[i] is true if s[0...i-1] can be segmented
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // empty string is "breakable"

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                // Check if s[j...i-1] is a word and s[0...j-1] is breakable
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // no need to check further splits
                }
            }
        }

        return dp[s.length()];
    }


    public static boolean wordBreak(String targetWord, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int targetWordLength = targetWord.length();
        boolean[] dp = new boolean[targetWordLength + 1];
        dp[targetWordLength] = true;  // Base case: empty string is breakable

        for (int i = targetWordLength - 1; i >= 0; i--) {

            for (String word : wordSet) {
                int wordLen = word.length();
                if (i + wordLen <= targetWordLength && targetWord.substring(i, i + wordLen).equals(word)) {
                    dp[i] = dp[i + wordLen];
                }
                if (dp[i]) break;
            }
        }
        return dp[0];
    }


    //does not work
    public static boolean wordBreakM(String targetWord, List<String> wordDict) {
        int targetWordLength = targetWord.length();
        boolean[] dp = new boolean[targetWordLength];

        for (int i = targetWordLength; i >= 0; ) {
            for (String word : wordDict) {
                if (word.length() <= targetWordLength &&
                        targetWord.substring(i - word.length(), i).equals(word)) {
                    dp[targetWordLength - word.length()] = true;
                    i = targetWordLength - word.length() - 1;
                    break;
                }
            }
        }
        return dp[0];
    }


    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("leet", "code");
        String s = "leetcode";
        System.out.println(wordBreak(s, wordDict));
    }
}
