package org.example.algo.yandex.bst.bst_check_with_min_max;

import org.example.algo.yandex.bst.TreeNode;

//Given the root of the BST and min and max values.
//check that each node is between min and max
public class Solution {

    public static boolean validateTreeLeaves(TreeNode root, int max, int min) {
        if (root == null) {
            return false;
        }

        int right = getRightMostValue(root);
        int left = getLeftMostValue(root);

        return (min <= left) && (max >= right);
    }

    private static int getLeftMostValue(TreeNode root) {
        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.val;
    }

    private static int getRightMostValue(TreeNode root) {
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.val;
    }
}
