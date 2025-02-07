package org.example.algo.yandex.linkedList_intersection;

import static org.example.algo.yandex.linkedList_intersection.Solution.getIntersectionNode;

public class Test {

    public static void main(String[] args) {
        Solution.ListNode intersection = new Solution.ListNode(8,
                new Solution.ListNode(4,
                        new Solution.ListNode(5)));

        Solution.ListNode head1 = new Solution.ListNode(4,
                new Solution.ListNode(1, intersection));

        Solution.ListNode head2 = new Solution.ListNode(5,
                new Solution.ListNode(6,
                        new Solution.ListNode(1, intersection)));

//        System.out.println(getIntersectionNode(head1, head2));


        //No Intersection
        Solution.ListNode head11 = new Solution.ListNode(4,
                new Solution.ListNode(1, new Solution.ListNode(234)));

        Solution.ListNode head22 = new Solution.ListNode(5,
                new Solution.ListNode(6,
                        new Solution.ListNode(1, new Solution.ListNode(567))));

        System.out.println(getIntersectionNode(head11, head22));
    }
}
