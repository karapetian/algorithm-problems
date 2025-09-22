package org.example.algo.yandex.strings.string_compression;

//N443:String Compression
public class Solution {

    //mine
//    static int compress(char[] chars) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < chars.length; i++) {
//            int charCounter = 1;
//
//            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
//                charCounter++;
//                i++;
//            }
//            String numAsString = charCounter > 1 ? String.valueOf(charCounter) : "";
//            sb.append(chars[i]).append(numAsString);
//
//        }
//        return sb.length();
//    }

    static int compress(char[] chars) {
        int write = 0; // Position to write the compressed result
        int read = 0;  // Position to read characters

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }


//    static int compress(char[] chars) {
//        int i = 0, res = 0;
//        while (i < chars.length) {
//            int groupLength = 1;
//            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
//                groupLength++;
//            }
//            chars[res++] = chars[i];
//            if (groupLength > 1) {
//                for (char c : Integer.toString(groupLength).toCharArray()) {
//                    chars[res++] = c;
//                }
//            }
//            i += groupLength;
//        }
//        return res;
//    }
}
