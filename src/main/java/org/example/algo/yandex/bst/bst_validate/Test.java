package org.example.algo.yandex.bst.bst_validate;

import org.example.algo.yandex.bst.TreeNode;

import static org.example.algo.yandex.bst.bst_validate.Solution.isValidBST;

public class Test {

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
//        TreeNode root = new TreeNode(2, new TreeNode(2), new TreeNode(2));
//        TreeNode root = new TreeNode(2147483647);

        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(isValidBST(root));
    }
}
