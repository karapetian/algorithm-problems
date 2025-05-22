package org.example.algo.yandex.bst.two_sum_4th;

import org.example.algo.yandex.bst.TreeNode;

import java.util.HashSet;
import java.util.Set;

//653. Two Sum IV - Input is a BST
//You visit each node exactly once, and each contains() and add() operation on a HashSet is O(1) (on average).
//So, Time complexity = O(n), where n is the number of nodes

//Space complexity consists of 2parts.
//HashSet - O(n)
//Recursion - In the worst case (unbalanced tree), depth = O(n)
//In the best case (balanced tree), depth = O(log n)
//So auxiliary stack space = O(h) where h is the tree height
public class Solution {

    private Set<Integer> values = new HashSet<>(); //5 3

    //5,3,6 ->9
    public boolean findTarget(TreeNode root, int k) {
        if (root==null) {
            return false; //ch
        }

        int diff = k - root.val; //9-6==3
        if (values.contains(diff)) {
            return true;
        }

        values.add(root.val);
        //3, 9                      //6, 9
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
