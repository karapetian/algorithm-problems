package org.example.algo.longest_common_prefix;

public class Solution2 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].isEmpty()) return "";
        String result = recurse(strs, 0, strs.length - 1);

        return result;
    }

    private static String recurse(String[] strs, int start, int end) {
        if (end == start) {
            return strs[end];
        }
        int mid = (start+end) / 2;
        String left = recurse(strs, start, mid);
        String right = recurse(strs, mid + 1, end);
        return fidCommonPrefix(left, right);
    }

    private static String fidCommonPrefix(String left, String right) {
        if (left.isEmpty() || right.isEmpty()) {
            return "";
        }
        if (right.length()> left.length()) {
            right = right.substring(0, left.length());
        } else {
            left = left.substring(0, right.length());
        }

        while (!right.equals(left)) {
            left = left.substring(0, left.length()-1);
            right = right.substring(0, right.length()-1);
        }
        return left;
    }


    public static void main(String[] args) {
        System.out.println(fidCommonPrefix("flower", "flow"));
    }
}
