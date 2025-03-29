package org.example.algo.yandex.bst.sorted_array_to_bst;

import org.example.algo.yandex.bst.TreeNode;

//108. Convert Sorted Array to Binary Search Tree
//Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
//A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
// [-10,-3,0,5,9]
public class Solution {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return recursiveInsert(nums, 0, nums.length - 1);
    }

    private static TreeNode recursiveInsert(int[] nums, int left, int right) {
        if (right < left) {
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode parent = new TreeNode(nums[mid]);

        TreeNode leftNode = recursiveInsert(nums, left, mid-1);
        TreeNode rightNode = recursiveInsert(nums, mid + 1, right);

        parent.left = leftNode;
        parent.right = rightNode;

        return parent;
    }
}
