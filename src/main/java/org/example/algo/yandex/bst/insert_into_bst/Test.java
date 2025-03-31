package org.example.algo.yandex.bst.insert_into_bst;

import org.example.algo.yandex.bst.TreeNode;

import static org.example.algo.yandex.bst.insert_into_bst.Solution.insertIntoBST;

public class Test {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7));

        insertIntoBST(root, 5);
        System.out.println(root);

        System.out.println(insertIntoBST(null, 5));
    }
}
