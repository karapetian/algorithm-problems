package org.example.algo.yandex.bst.find_mode_in_BST;

import org.example.algo.yandex.bst.TreeNode;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null));

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findMode(root)));
        System.out.println(Arrays.toString(solution.findMode2(root)));
    }
}
