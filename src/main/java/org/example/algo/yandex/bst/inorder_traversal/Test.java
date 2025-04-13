package org.example.algo.yandex.bst.inorder_traversal;

import org.example.algo.yandex.bst.TreeNode;

import static org.example.algo.yandex.bst.inorder_traversal.Solution.inorderTraversal;

public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
//        TreeNode root = new TreeNode(1,
//                null,
//                new TreeNode(2, null, new TreeNode(3)));

        System.out.println(inorderTraversal(root));
    }
}
