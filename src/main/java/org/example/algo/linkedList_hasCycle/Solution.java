package org.example.algo.linkedList_hasCycle;

import org.example.algo.util.ListNode;

//determine if the linked list has a cycle in it.

//the same solution is used to find the element in the middle
public class Solution {

    static boolean hasCycle(ListNode head) {
        if (head == null || !head.hasNext()) {
            return false;
        }

        ListNode x = head; // move one step
        ListNode y = head; // move two steps
        while (y != null && !y.hasNext()) {
            x = x.next;
            y = y.next.next;
            if (y != null && x == y) {
                return true;
            }
        }
        return false;
    }

}
