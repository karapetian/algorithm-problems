package org.example.algo.yandex.bst.search;

import org.example.algo.yandex.bst.TreeNode;

//700. Search in a Binary Search Tree
public class Solution {

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        return recursiveSearch(root, val);
    }

    private static TreeNode recursiveSearch(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (val == root.val) {
            return root;
        }
        if (val < root.val) {
           return recursiveSearch(root.left, val);
        } else {
            return recursiveSearch(root.right, val);
        }
    }
}
