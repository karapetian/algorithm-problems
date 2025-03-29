package org.example.algo.yandex.bst.bst_validate;


import org.example.algo.yandex.bst.TreeNode;

//98. Validate Binary Search Tree
//Given the root of a binary tree, determine if it is a valid binary search tree
// Time complexity O(n)
// Space complexity O(h)
public class Solution {

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isValid(root, null, null);
    }

    private static boolean isValid(TreeNode root, Integer minInt, Integer maxInt) {
        if (root == null) {
            return true;
        }
        if (minInt != null && root.val <= minInt) {
            return false;
        }
        if (maxInt != null && root.val >= maxInt) {
            return false;
        }
        return isValid(root.left, minInt, root.val) && isValid(root.right, root.val, maxInt);
    }
}
