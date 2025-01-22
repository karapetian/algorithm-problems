package org.example.algo.practicum.yandex.dyn_fit_in_backpack;

import static org.example.algo.practicum.yandex.dyn_fit_in_backpack.Solution.knapsack;

public class Test {

    public static void main(String[] args) {
        int[] weights = {3, 4, 5, 6};
        int maxWeight = 10;
        int[] result = knapsack(weights, maxWeight);
        int maxWeightPossible = result[0];
        int numItemsIncluded = result[1];
        int[] itemsIncluded = new int[numItemsIncluded];
        System.arraycopy(result, 2, itemsIncluded, 0, numItemsIncluded);

        System.out.println("Максимальный вес: " + maxWeightPossible);
        System.out.print("Включенные предметы: ");
        for (int item : itemsIncluded) {
            System.out.print(item + " ");
        }
    }
}
