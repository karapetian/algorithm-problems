package org.example.algo.practicum.yandex.tree_LayeredRepresentation;

import java.util.List;

import static org.example.algo.practicum.yandex.tree_LayeredRepresentation.Solution.getLayeredRepresentation;
import static org.example.algo.practicum.yandex.tree_LayeredRepresentation.Solution.levelOrderTraversal;

public class Test {

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> layeredRepresentation = getLayeredRepresentation(root);
        //[[1], [2, 3], [4, 5]]
        System.out.println(layeredRepresentation);

        //[[1], [2, 3], [4, 5]]
        System.out.println(levelOrderTraversal(root));
    }
}
