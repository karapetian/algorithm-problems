package org.example.algo.longest_common_prefix;

public class Solution {

    //["flower","flow","flight"]
    //{"dog","racecar","car"}
    //["baab","bacb","b","cbc"]
    //["cir","car"]
    public static String longestCommonPrefix_old(String[] strs) {
        String result = "";

        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs.length - 1; i++) {
            String current = strs[i];
            String next = strs[i + 1];

            if (current.isEmpty() || next.isEmpty()) {
                return "";
            }

            char[] charArrayCurr = current.toCharArray();
            char[] charArrayNext = next.toCharArray();

            for (int j = 0; j < charArrayCurr.length && j < charArrayNext.length; j++) {
                if (charArrayCurr[j] != charArrayNext[j]) {
                    if (j == 0) {
                        return "";
                    } else {
//                        result = result.substring(0, result.length() - 1); ???
                        return result; //fl -> i=1; j=2   //ba -> i=0, j=2
                    }
                } else if (j < result.length() && charArrayCurr[j] == result.toCharArray()[j]) {
                    continue;
                } else {
                    result = result + charArrayCurr[j];
                }
            }
        }

        return result;
    }

    public static String longestCommonPrefix_mine(String[] strs) {
        String result = strs[0];

        if (strs.length == 1) {
            return strs[0];
        } else if (strs[0].isEmpty()) {
            return "";
        }

        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];

            if (current.isEmpty()) {
                return "";
            }

            char[] charArrayCurr = current.toCharArray();
            char[] charArrayResult = result.toCharArray();

            for (int j = 0; j < charArrayCurr.length && j < charArrayResult.length; j++) {
                if (charArrayCurr[j] != charArrayResult[j]) {
                    if (j == 0) {
                        return "";
                    } else {
                        result = result.substring(0, j);
                        break;
                    }
                } else if (j < result.length() && charArrayCurr[j] == result.toCharArray()[j] && current.length() < result.length()) {
                    result = current;
                }
            }
        }
        return result;
    }

    public static String longestCommonPrefix_LC(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
