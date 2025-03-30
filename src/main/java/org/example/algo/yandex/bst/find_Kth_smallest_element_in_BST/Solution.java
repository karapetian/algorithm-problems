package org.example.algo.yandex.bst.find_Kth_smallest_element_in_BST;

import org.example.algo.yandex.bst.TreeNode;

//230. Kth Smallest Element in a BST
//Find the K-th smallest element in given BST (root)
//space complexity is O(h) because of recursion
//and the Time complexity is O(n)
public class Solution {

    private int index = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        return inorder(root, k);
    }

    private int inorder(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        int result = inorder(root.left, k);
        if (result != -1) {
            return result;
        }

        index = index + 1;
        if (k == index) {
            return root.val;
        }

        int rightResult = inorder(root.right, k);
        if (rightResult != -1) {
            return rightResult;
        }

        return -1;
    }
}
