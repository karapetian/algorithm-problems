package org.example.algo.yandex.bst.inorder_traversal;

import org.example.algo.yandex.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

//94. Binary Tree Inorder Traversal
//Given the root of a binary tree, return the inorder traversal of its nodes' values.
//Inorder traversal is a depth-first search algorithm for a binary search tree that first traverses the left subtree,
//then the root, then traverses the right subtree. This provides the nodes of the binary search tree in increasing order.
public class Solution {

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}
