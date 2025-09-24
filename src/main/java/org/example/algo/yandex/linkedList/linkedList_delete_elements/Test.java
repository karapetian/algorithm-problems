package org.example.algo.yandex.linkedList.linkedList_delete_elements;

import static org.example.algo.yandex.linkedList.linkedList_delete_elements.Solution.removeElements;

public class Test {

    public static void main(String[] args) {

        Solution.ListNode head1 = new Solution.ListNode(1,
                new Solution.ListNode(2,
                        new Solution.ListNode(3,
                                new Solution.ListNode(6,
                                        new Solution.ListNode(4,
                                                new Solution.ListNode(5,
                                                        new Solution.ListNode(6)))))));
        System.out.println(removeElements(head1, 6));


        Solution.ListNode head2 = new Solution.ListNode(7,
                new Solution.ListNode(7,
                        new Solution.ListNode(7)));
//        System.out.println(removeElements(head2, 7));
    }
}
