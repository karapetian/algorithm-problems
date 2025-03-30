package org.example.algo.yandex.bst.find_Kth_biggest_element_in_BST;

import org.example.algo.yandex.bst.TreeNode;

public class Solution {

    private int index = 0;

    public int kthBiggest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        return inorder(root, k);
    }

    private int inorder(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        int result = inorder(root.right, k);
        if (result != -1) {
            return result;
        }

        index = index + 1;
        if (k == index) {
            return root.val;
        }

        int rightResult = inorder(root.left, k);
        if (rightResult != -1) {
            return rightResult;
        }

        return -1;
    }
}
