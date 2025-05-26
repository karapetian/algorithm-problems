package org.example.algo.yandex.bst.bst_max_dept;

import org.example.algo.yandex.bst.TreeNode;

//104. Maximum Depth of Binary Tree
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if(root.left==null && root.right==null) {
            return 1;
        }

        int max = Math.max(maxDepth(root.left), maxDepth(root.right));
        return max+1;
    }
}
