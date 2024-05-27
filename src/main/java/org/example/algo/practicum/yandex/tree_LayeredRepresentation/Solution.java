package org.example.algo.practicum.yandex.tree_LayeredRepresentation;

import java.util.ArrayList;
import java.util.List;

//Задача. Дано бинарное дерево, нужно вывести список списков значений вершин «по слоям».
// В каждом слое значения должны идти слева направо.
public class Solution {

    static List<List<Integer>> getLayeredRepresentation(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        depthFirstSearch(root, 0, result);
        return result;
    }

    private static void depthFirstSearch(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.getVal());

        depthFirstSearch(root.getLeft(), level + 1, result);
        depthFirstSearch(root.getRight(), level + 1, result);
    }
}
