package org.example.algo.yandex.bst.find_Kth_biggest_element_in_BST;

import org.example.algo.yandex.bst.TreeNode;

public class Test {

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4));

        TreeNode root2 = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                new TreeNode(6));

        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        Solution solution = new Solution();
        System.out.println(solution.kthBiggest(root, 2));
    }
}
