package org.example.algo.align.revert_binary_tree;

import org.example.algo.yandex.bst.TreeNode;

import java.util.LinkedList;

//226. Invert (revert) Binary Tree
public class Solution {

    static void invertTree(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderSet(root);
    }

    private static TreeNode inOrderSet(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode right = inOrderSet(root.left);
        TreeNode left = inOrderSet(root.right);

        root.left = left;
        root.right = right;
        return root;
    }

    /////////////////////////////////////////////////////////////////////////

    static void invertTree2(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root); //push 1st element

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4));
        System.out.println(root1);
        invertTree2(root1);
        System.out.println(root1);

        TreeNode root2 = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                new TreeNode(6));

//        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
//        System.out.println(root);
//        invertTree(root);
//        System.out.println(root);

    }
}
