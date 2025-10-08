package org.example.algo.adobe.roman_to_arabic;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<Character, Integer> numbers;

    static {
        numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);
    }

    static int romanToInt(String test) {
        char[] charArray = test.toCharArray();
        int result = 0;
        for (int i = 0; i < charArray.length; i++) { //i
            Integer current = numbers.get(charArray[i]);  //

            if (i + 1 < charArray.length) {
                Integer nextNum = numbers.get(charArray[i + 1]);
                if (current == null || nextNum == null) {
                    return -1;
                }
                if (current < nextNum) {
                    result = result - current;
                } else  {
                    result = result + current;
                }
            } else {
                result = result + current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("IV"));
        System.out.println("1994 = " + romanToInt("MCMXCIV"));
//        System.out.println("58 = " + romanToInt("LVIII"));
    }
}
