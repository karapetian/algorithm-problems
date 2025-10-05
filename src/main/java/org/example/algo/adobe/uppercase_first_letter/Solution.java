package org.example.algo.adobe.uppercase_first_letter;

//Make the 1st letters of the words uppercase.
public class Solution {

    public static String uppercaseFirstLetters(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length() - 1; i++) {
            if (inputArray[i] == ' ' && (inputArray[i + 1] != ' ')) {
                inputArray[i + 1] = Character.toUpperCase(inputArray[i + 1]);
                i++;
            }
        }

        return new String(inputArray);
    }

    public static void main(String[] args) {
        System.out.println(uppercaseFirstLetters(" aaa bbb  ccc "));
    }
}
