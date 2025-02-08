package org.example.algo.yandex.linkedList_delete_elements;

//203. Remove Linked List Elements
public class Solution {

    static class ListNode {
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

    //{1,2,3,6,4,5,6}
    static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode bubble = new ListNode(0);
        ListNode curr = head;
        ListNode prev = bubble;
        prev.next = head;
        while (curr != null) {
            if (curr.val == val) {
                // delete
                prev.next = curr.next;
                curr = curr.next;
                continue;
            }
            prev = curr;
            curr = curr.next;
        }

        return bubble.next;
    }
}
