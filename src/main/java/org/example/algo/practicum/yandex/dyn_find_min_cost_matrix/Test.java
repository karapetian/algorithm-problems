package org.example.algo.practicum.yandex.dyn_find_min_cost_matrix;

import static org.example.algo.practicum.yandex.dyn_find_min_cost_matrix.Solution.minCost;

public class Test {

    public static void main(String args[]) {

        int cost[][] = {{1, 2, 3}, {4, 8, 2}, {1, 5, 3}};

        System.out.print(minCost(cost, 2, 2));
    }
}
