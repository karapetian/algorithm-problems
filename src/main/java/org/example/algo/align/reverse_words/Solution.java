package org.example.algo.align.reverse_words;

//151. Reverse Words in a String
// Solution N2 - split by space.
public class Solution {

    static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        char[] inputArray = s.toCharArray();

        Integer endIdx = null;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (inputArray[i] != ' ') {
                if (endIdx == null) {
                    endIdx = i;
                }

                if (i == 0 || inputArray[i - 1] == ' ') {
                    builder.append(s.substring(i, endIdx + 1)).append(" ");
                    endIdx = null;
                }
            }
        }

        return builder.toString().trim();
    }

    public static void main(String[] args) {
//        String input = "the sky is blue";
        String input = "a good   example";
        System.out.println(reverseWords(input));
    }
}
