package org.example.algo.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static int romanToInt_1(String test) {
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        Map<String, Integer> subNumbers = new HashMap<>();
        subNumbers.put("IV", 4);
        subNumbers.put("IX", 9);
        subNumbers.put("XL", 40);
        subNumbers.put("XC", 90);
        subNumbers.put("CD", 400);
        subNumbers.put("CM", 900);


        int result = 0;
        char[] charArray = test.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i + 1 < charArray.length && subNumbers.containsKey(test.substring(i, i + 2))) {
                result = result + subNumbers.get(test.substring(i, i + 2));
                i++;
            } else {
                Integer numeric = numbers.get(charArray[i]);
                result = result + numeric;
            }
        }
        return result;
    }

    public static int romanToInt_2(String test) {
        int result = 0;
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        char[] charArray = test.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
            if (i < charArray.length - 1 && numbers.get(charArray[i]) < numbers.get(charArray[i + 1])) {
                result = result - numbers.get(charArray[i]);
            } else {
                result = result + numbers.get(charArray[i]);
            }
        }
        return result;
    }


    public static int romanToInt_3(String s) {
        int result = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            if (4 * num < result) {
                result = result - num;
            } else {
                result = result + num;
            }
        }
        return result;
    }
}
