package org.example.algo.linked_list;

import org.example.algo.util.ListNode;

//my implementation of the LinkedList that keeps ints
public class NodesList {

    private ListNode head;
    private int size;

    public void add(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
        } else {
            //travers till the end
            ListNode current = head;
            while (current.hasNext()) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    public void insertInSpecificPosition(int value, int position) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
        } else if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next.val = value;
        }
        size++;
    }

    public void updateSpecificPosition(int value, int position) {
        if (position == 0) {
            head.val = value;
        } else {
            ListNode current = head;
            for (int i = 0; i <= position; i++) {
                if (i == position - 1) {
                    ListNode newNode = new ListNode(value);
                    newNode.next = current.next.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        }
    }

    public void deleteByPosition(int position) {
        if (position >= size || position < 0) {
            throw new IllegalArgumentException("");
        }

        if (position == 0) {
            head = head.next;
            size--;
            return;
        }

        ListNode current = head;
        for (int i = 0; i < size - 1; i++) {
            if (i == position - 1) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        size--;
    }

    public void deleteByValue(int value) {
        if (head == null) {
            throw new RuntimeException();
        }

        ListNode current = head;
        while (current.hasNext()) {
            if (current.next.val == value) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void printNodesList() {
        System.out.println("NodesList of size: " + size);
        if (head != null) {
            ListNode current = head;
            do {
                System.out.println(current);
            } while ((current = current.next) != null);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
