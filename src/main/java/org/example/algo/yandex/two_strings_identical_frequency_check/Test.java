package org.example.algo.yandex.two_strings_identical_frequency_check;

import static org.example.algo.yandex.two_strings_identical_frequency_check.Solution.haveSameCharacterFrequency;

public class Test {

    public static void main(String[] args) {
        String str1 = "aabbcc";
        String str2 = "baccab";

        System.out.println("Do the strings have the same character frequencies? " +
                haveSameCharacterFrequency(str1, str2));
    }
}
