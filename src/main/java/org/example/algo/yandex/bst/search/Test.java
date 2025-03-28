package org.example.algo.yandex.bst.search;

import org.example.algo.yandex.bst.TreeNode;

import static org.example.algo.yandex.bst.search.Solution.searchBST;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7));

        System.out.println(searchBST(root, 2));



        System.out.println(searchBST(root, 5));
    }
}
