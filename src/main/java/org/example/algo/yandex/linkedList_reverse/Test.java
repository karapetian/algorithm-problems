package org.example.algo.yandex.linkedList_reverse;

import static org.example.algo.yandex.linkedList_reverse.Solution.reverseList;

public class Test {

    public static void main(String[] args) {

        Solution.ListNode node = new Solution.ListNode(1,
                new Solution.ListNode(2,
                        new Solution.ListNode(3,
                                new Solution.ListNode(4,
                                        new Solution.ListNode(5)))));

        System.out.println(reverseList(node));
    }
}
