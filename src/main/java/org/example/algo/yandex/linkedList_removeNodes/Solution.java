package org.example.algo.yandex.linkedList_removeNodes;

import java.util.Stack;

//2487. Remove Nodes From Linked List
//Remove every node which has a node with a greater value anywhere to the right side of it.
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

//wrong
    static ListNode removeNodes2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        int max = head.val;
        ListNode newHead = new ListNode(max);
        for (int i = 0; i < stack.size(); i++) {
            ListNode currNode = stack.pop();
            if (currNode.val > max) {
                ListNode newNode = new ListNode(currNode.val);
                newNode.next = newHead;
                newHead = newNode;
                max = currNode.val;
            }
        }

        return newHead;
    }

    static ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        current = stack.pop();
        int maximum = current.val;
        ListNode resultList = new ListNode(maximum);

        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current.val < maximum) {
                continue;
            } else {
                ListNode newNode = new ListNode(current.val);
                newNode.next = resultList;
                resultList = newNode;
                maximum = current.val;
            }
        }

        return resultList;
    }
}
