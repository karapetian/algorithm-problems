package org.example.algo.rm_duplicates_from_sortedList;


import org.example.algo.util.ListNode;

// We have a sorted linked list and its head node.
// Removed duplicate nodes and the return modified list.
// values are from -100 to 100
public class Problem {

    static ListNode rmDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode.hasNext()) {
            if (currentNode.val == currentNode.next.val) {
                if (currentNode.next.hasNext()) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode.next = null;
                }
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    // as the values are from -100 to 100, lets keep an array with the size of 201
    // and put the values of linkedList in the array appropriate to the index
    static ListNode deleteDuplicatesWithArray(ListNode head) {
        int[] array = new int[201];
        ListNode current = head;
        // put values in array in corresponding index
        while (current != null) {
            array[current.val + 100]++;
            current = current.next;
        }
        // structure new linkedList
        current = null;
        ListNode newHead = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                if (newHead == null) {
                    newHead = current = new ListNode(i - 100);
                } else {
                    current.next = new ListNode(i - 100);
                    current = current.next;
                }
            }
        }
        return newHead;
    }
}

