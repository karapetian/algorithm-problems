package org.example.algo.adobe.prive_sum;

//Write a function that accepts 2 non-negative integers n and m and returns the sum of
//n-th and m-th prime numbers
//Pattern of prime numbers: Except for 2 and 3, all prime numbers are of the form 6k ± 1
public class Solution {

    static int getPrimesSum(int n, int m) {
        if (n <= 0 || m <= 0) {
            return -1;
        }
        int nthPrime = getKthPrime(n);
        int mthPrime = getKthPrime(m);
        return nthPrime + mthPrime;
    }

    private static int getKthPrime(int k) {
        int count = 0, num = 1;
        while (count < k) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
               // (6k – 1)      (6k + 1)
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5; // 5th prime = 11
        int m = 10; // 10th prime = 29
        System.out.println("Sum: " + getPrimesSum(n, m)); // Output: 40
    }
}
