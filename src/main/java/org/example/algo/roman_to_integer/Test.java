package org.example.algo.roman_to_integer;

public class Test {

    public static void main(String[] args) {
        int i = Solution.romanToInt_2("MCMXCIV");
        System.out.println("1994 = " + i);
        int j = Solution.romanToInt_2("LVIII");
        System.out.println("58 = " + j);
    }
}
