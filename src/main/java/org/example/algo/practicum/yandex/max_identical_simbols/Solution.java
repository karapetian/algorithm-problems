package org.example.algo.practicum.yandex.max_identical_simbols;

// найти максимальное число идущих подряд одинаковых символов в строке.
// O(n) complexity
public class Solution {

    public static int maxConsecutiveElements(String inputStr) {
        int result = 0;
        int curLetterIdx = 0;
        while (curLetterIdx < inputStr.length()) {
            int nextLetterIdx = curLetterIdx;
            while (nextLetterIdx < inputStr.length() &&
                    inputStr.charAt(nextLetterIdx) == inputStr.charAt(curLetterIdx)) {
                nextLetterIdx++;
            }
            result = Math.max(result, nextLetterIdx - curLetterIdx);
            curLetterIdx = nextLetterIdx;
        }
        return result;
    }
}
