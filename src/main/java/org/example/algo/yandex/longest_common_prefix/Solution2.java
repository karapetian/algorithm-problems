package org.example.algo.yandex.longest_common_prefix;

//BEST Solution
//14. Longest Common Prefix
public class Solution2 {

    static String longestCommonPrefix(String[] strs) {
        if (strs.length==0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i< strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
