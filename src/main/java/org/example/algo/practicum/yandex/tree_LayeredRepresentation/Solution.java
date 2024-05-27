package org.example.algo.practicum.yandex.tree_LayeredRepresentation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    //Solution 2
    static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelValues.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(levelValues);
        }

        return result;
    }
}
