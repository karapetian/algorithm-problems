package org.example.algo.yandex.bst.insert_into_bst;

import org.example.algo.yandex.bst.TreeNode;

//701. Insert into a Binary Search Tree
public class Solution {

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        recursiveInsert(root, val);

        return root;
    }

    private static TreeNode recursiveInsert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            TreeNode leftNode = recursiveInsert(root.left, val);
            root.left = leftNode;
        } else {
            TreeNode rightNode = recursiveInsert(root.right, val);
            root.right = rightNode;
        }
        return root;
    }
}
//TreeNode{val=4,
// left=TreeNode{val=2, left=TreeNode{val=1, left=null, right=null}, right=TreeNode{val=3, left=null, right=null}},
// right=TreeNode{val=7, left=TreeNode{val=5, left=null, right=null}, right=null}}
