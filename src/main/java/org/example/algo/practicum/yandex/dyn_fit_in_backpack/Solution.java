package org.example.algo.practicum.yandex.dyn_fit_in_backpack;

//есть N предметов, вес каждого — положительное целое число. Веса записаны в массиве arr.
//Рюкзак может выдержать содержимое не тяжелее X. Выберите такое подмножество предметов, чтобы их суммарный вес был
//максимальный, но не превосходил X.
public class Solution {

    static int[] knapsack(int[] weights, int maxWeight) {
        int n = weights.length;
        int[][] dp = new int[n + 1][maxWeight + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= maxWeight; w++) { //because of целое число
                if (weights[i - 1] > w) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + weights[i - 1]);
                }
            }
        }

        int maxWeightPossible = dp[n][maxWeight];
        int[] itemsIncluded = new int[n];
        int k = 0;
        int w = maxWeight;
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                itemsIncluded[k++] = weights[i - 1];
                w -= weights[i - 1];
            }
        }

        int[] result = new int[k + 1];
        result[0] = maxWeightPossible;
        for (int i = 0; i < k; i++) {
            result[i + 1] = itemsIncluded[i];
        }

        return result;
    }
}
