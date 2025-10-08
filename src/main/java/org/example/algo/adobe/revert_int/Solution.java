package org.example.algo.adobe.revert_int;

public class Solution {

    static int revertInt(int number) {
        if (number < 10 && number >= 0) {
            return number;
        }
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);
        int result = 0;
        while (number > 0) {
            int remaining = number % 10; //
            result = result * 10 + remaining; //
            number = number / 10; //
        }

        return sign * result;
    }

    public static void main(String[] args) {
        System.out.println(revertInt(12));
    }
}
