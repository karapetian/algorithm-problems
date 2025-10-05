package org.example.algo.adobe.convertToInteger;

//Convert String into an Integer. Return 0 in case of invalid input.
public class Solution {


    static  int convertToInteger(String input) {
        int result = 0;
        if (input == null || input.isEmpty()) {
            return result;
        }

        char[] inputArray = input.toCharArray();
        int sign = 1;
        int i = 0;

        if(inputArray[0] == '+') {
            i = 1;
        } else if(inputArray[0] == '-') {
            i = 1;
            sign = -1;
        }
        for (; i< inputArray.length; i++) {
            if(inputArray[i] < '0' || inputArray[i] > '9') {
                return 0;
            }
            int numericChar =  Character.getNumericValue(inputArray[i]);
            result = result * 10 + numericChar;

        }

        return result * sign;
    }


    public static void main(String[] args) {
        System.out.println(convertToInteger("2467"));
        System.out.println(convertToInteger("-2467"));
        System.out.println(convertToInteger("24+67"));
    }
}
