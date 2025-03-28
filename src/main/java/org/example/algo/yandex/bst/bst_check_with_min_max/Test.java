package org.example.algo.yandex.bst.bst_check_with_min_max;

import org.example.algo.yandex.bst.TreeNode;

import static org.example.algo.yandex.bst.bst_check_with_min_max.Solution.validateTreeLeaves;

public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(validateTreeLeaves(root, 5, 0));
        System.out.println(validateTreeLeaves(root, 3, 0));
        System.out.println(validateTreeLeaves(root, 0, 0));
    }
}
