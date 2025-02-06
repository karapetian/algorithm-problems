package org.example.algo.yandex.linkedList_removeNodes;

import static org.example.algo.yandex.linkedList_removeNodes.Solution.removeNodes;

public class Test {

    public static void main(String[] args) {

        Solution.ListNode node = new Solution.ListNode(5,
                new Solution.ListNode(2,
                        new Solution.ListNode(13,
                                new Solution.ListNode(3,
                                        new Solution.ListNode(8)))));

        System.out.println(removeNodes(node));
    }
}
