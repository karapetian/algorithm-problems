package org.example.algo.yandex.linkedList.linkedList_delete_N_nodes_after_M_nodes;

//1474. Delete N Nodes After M Nodes of a Linked List
//Keep repeating steps until you reach the end of the list.
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

    static ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode curr = head;
        ListNode prev = null;
        int countM = m;
        int countN = n;
        while (curr != null) {
            while (countM != 0 && curr != null) {
                prev = curr;
                curr = curr.next;
                countM--;
            }

            while (countN != 0 && curr!=null) {
                //delete node
                prev.next=curr.next;
                curr = curr.next;
                countN--;
            }
            countM=m;
            countN=n;
        }

        return head;
    }

    static ListNode deleteNodes2(ListNode head, int m, int n) {
        ListNode current = head;
        ListNode prev = new ListNode();
        prev.next = current;

        int countM = m;
        int countN = n;

        while(current !=null) {
            if(countM != 0) {
                current = current.next;
                prev = prev.next;
                countM --;
            }  else if ( countN!=0) {
                //delete
                current = current.next;
                prev.next = current;
                countN --;
            }

            if(countM==0 && countN==0) {
                countM = m;
                countN = n;
            }
        }

        return head;
    }
}
