package org.example.algo.yandex.strings.last_word_length;

//58. Length of Last Word
public class Solution {

    static int lengthOfLastWord(String s) {
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter > 0 && s.charAt(i) == ' ') {
                break;
            }

            if (s.charAt(i) != ' ') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
