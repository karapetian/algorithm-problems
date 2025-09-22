package org.example.algo.yandex.strings.index_of_first_occurrence;

//28. Find the Index of the First Occurrence in a String
public class Solution {

    //O(n*m)
    static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;
        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i; // found match
            }
        }

        return -1; // not found
    }

    //O(n+m)
    static int strStr2(String haystack, String needle) {
        if (needle == null || haystack == null) return -1;
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) return 0;
        if (n < m) return -1;

        // Preprocess needle to get lps array
        int[] lps = computeLPS(needle);

        int i = 0;  // index for haystack
        int j = 0;  // index for needle

        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    return i - j;
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

    private static int[] computeLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        // length of the previous longest prefix-suffix
        int len = 0;
        lps[0] = 0;  // lps[0] is always 0
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    // fallback to previous lps
                    len = lps[len - 1];
                    // note: we do *not* increment i here
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}