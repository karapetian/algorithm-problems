package org.example.algo.node_where_cycle_begins;

import org.example.algo.util.ListNode;

// return the node where the cycle begins.
// If there is no cycle, return null.
public class Solution {


    // 2.move the head and the cyclingNode by one step until they meet
    public static ListNode cyclingNode(ListNode head) {
        ListNode crossingNode = crossingNode(head);
        if (crossingNode == null) {
            return null;
        }
        ListNode current = head;
        while (crossingNode != current) {
            crossingNode = crossingNode.next;
            current = current.next;
        }
        return current;
    }


    // 1.returns the node where they have met.
    private static ListNode crossingNode(ListNode head) {
        if (head == null || !head.hasNext()) {
            return null;
        }

        ListNode x = head; // move one step
        ListNode y = head; // move two steps
        while (y != null && !y.hasNext()) {
            x = x.next;
            y = y.next.next;
            if (y != null && x == y) {
                return x;
            }
        }
        return null;
    }
}
