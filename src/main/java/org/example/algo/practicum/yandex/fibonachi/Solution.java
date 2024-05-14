package org.example.algo.practicum.yandex.fibonachi;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, …
//По времени оба решения работают за O(n), но нерекурсивное решение использует O(1) дополнительной памяти, в то время как
// рекурсивное требует O(n) памяти для мемоизации и стека вызовов.
public class Solution {

    static int findFibonachi(final int n) {
        int result = 1;
        int tmp = 0;
        int previous = 0;

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            tmp = result;
            result = previous + result;
            previous = tmp;
        }

        return result;
    }

    static int findFibonachi_Rec(final int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        return findFibonachi_Rec(n - 1) + findFibonachi_Rec(n - 2);
    }
}
