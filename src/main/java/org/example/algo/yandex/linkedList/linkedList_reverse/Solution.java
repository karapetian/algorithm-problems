package org.example.algo.yandex.linkedList.linkedList_reverse;

//206. Reverse Linked List
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


    static ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
        }


        return prev;
    }
}
