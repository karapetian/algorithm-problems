package org.example.algo.yandex.linkedList_intersection;

//160. Intersection of Two Linked Lists
//Given the heads of two singly linked-lists return the node at which the two lists intersect.

//Another Solution: Add all nodes from headA to HashSet. Travers trough headB and check if the set contains the Node.
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    //Take 2 pointers for headA and headB. When you reach the end of headA, you should move the pA pointer
    //to headB. Do the same for headB and pB.
    //In the end on the intersection Node the pointers should meet, as they passed the same amount of Nodes.
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;

        while (pB != pA) {
            if (pA != null) {
                pA = pA.next;
            } else {
                pA = headB;
            }

            if (pB != null) {
                pB = pB.next;
            } else {
                pB = headA;
            }
        }

        return pA;
    }
}
