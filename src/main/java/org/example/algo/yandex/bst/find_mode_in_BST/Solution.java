package org.example.algo.yandex.bst.find_mode_in_BST;

import org.example.algo.yandex.bst.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//501. Find Mode in Binary Search Tree
//Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.
public class Solution {
    private int currentVal;
    private int currentCount = 0;
    private List<Integer> modes = new ArrayList<>();

    private int maxCount = 0;
    private HashMap<Integer, Integer> nodesWithCounts = new HashMap<>();

    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        inOrderTraversal(node.left);

        currentCount = (node.val == currentVal) ? currentCount + 1 : 1;
        if (currentCount == maxCount) {
            modes.add(node.val);
        } else if (currentCount > maxCount) {
            maxCount = currentCount;
            modes.clear();
            modes.add(node.val);
        }
        currentVal = node.val;

        inOrderTraversal(node.right);
    }

    public int[] findMode2(TreeNode root) {
        inOrderTraversal2(root);
        return nodesWithCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .mapToInt(entry -> entry.getKey())
                .toArray();
    }

    private void inOrderTraversal2(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderTraversal2(node.left);

        if (nodesWithCounts.containsKey(node.val)) {
            Integer value = nodesWithCounts.get(node.val);
            nodesWithCounts.put(node.val, value + 1);
            maxCount = Math.max(maxCount, value + 1);
        } else {
            nodesWithCounts.put(node.val, 1);
            maxCount = Math.max(maxCount, 1);
        }

        inOrderTraversal2(node.right);
    }
}
