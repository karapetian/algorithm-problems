package org.example.algo.yandex.linkedList.linkedList_delete_N_nodes_after_M_nodes;

import static org.example.algo.yandex.linkedList.linkedList_delete_N_nodes_after_M_nodes.Solution.deleteNodes;
import static org.example.algo.yandex.linkedList.linkedList_delete_N_nodes_after_M_nodes.Solution.deleteNodes2;

//1474. Delete N Nodes After M Nodes of a Linked List
public class Test {

    public static void main(String[] args) {

        Solution.ListNode head22 = new Solution.ListNode(1,
                new Solution.ListNode(2,
                        new Solution.ListNode(3,
                                new Solution.ListNode(4,
                                        new Solution.ListNode(5,
                                                new Solution.ListNode(6,
                                                        new Solution.ListNode(7,
                                                                new Solution.ListNode(8,
                                                                        new Solution.ListNode(9,
                                                                                new Solution.ListNode(10,
                                                                                        new Solution.ListNode(11,
                                                                                                new Solution.ListNode(12,
                                                                                                        new Solution.ListNode(13)))))))))))));


//        System.out.println(deleteNodes(head22, 2, 3));


        Solution.ListNode head2 = new Solution.ListNode(6,
                new Solution.ListNode(3,
                        new Solution.ListNode(5,
                                new Solution.ListNode(6,
                                        new Solution.ListNode(2,
                                                new Solution.ListNode(8,
                                                        new Solution.ListNode(9,
                                                                new Solution.ListNode(2,
                                                                        new Solution.ListNode(3,
                                                                                new Solution.ListNode(4))))))))));


        System.out.println(deleteNodes(head2, 2, 1));
        System.out.println(deleteNodes2(head2, 2, 1));
    }
}
