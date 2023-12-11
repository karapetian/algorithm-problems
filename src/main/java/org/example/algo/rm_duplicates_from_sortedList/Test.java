package org.example.algo.rm_duplicates_from_sortedList;

import org.example.algo.util.ListNode;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {

    private static LinkedList<ListNode> sortedList = new LinkedList<>();

    static {
        ListNode g = new ListNode(5);
        ListNode f = new ListNode(5, g);
        ListNode e = new ListNode(4, f);
        ListNode d = new ListNode(3, e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(1, c);
        ListNode a = new ListNode(1, b);
        sortedList.addAll(Arrays.asList(a, b, c, d, e, f, g));
    }

    public static void main(String[] args) {
        System.out.println(sortedList);

        ListNode listNode = Problem.rmDuplicates(sortedList.getFirst());

        ListNode newFirstNode = Problem.deleteDuplicatesWithArray(sortedList.getFirst());

    }
}
