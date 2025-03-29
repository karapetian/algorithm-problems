package org.example.algo.yandex.bst.sorted_array_to_bst;

import org.example.algo.yandex.bst.TreeNode;

import static org.example.algo.yandex.bst.sorted_array_to_bst.Solution.sortedArrayToBST;

public class Test {
    public static void main(String[] args) {

        int [] input =  {-10,-3,0,5,9};

        TreeNode node = sortedArrayToBST(input);
        System.out.println(node);
    }
}
