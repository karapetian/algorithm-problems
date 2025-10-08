package org.example.algo.adobe.sum_of_digits;

//Repeatedly sums the digits of an integer
//Keeps doing so until the result is a single digit
public class Solution {

    static int sumOfDigits(int input) {
        int result = 0;
        while (input > 9) {
            result = 0;
            while (input > 0) {
                int reminder = input % 10; //
                result = result + reminder; //
                input = input / 10; //
            }
            input = result;
        }
        return result;
    }


    public static void main(String[] args) {
//        System.out.println(sumOfDigits(11));
        System.out.println(sumOfDigits(128));
    }
}
