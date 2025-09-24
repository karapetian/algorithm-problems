package org.example.algo.yandex.linkedList.linkedList_hasCycle;

import org.example.algo.yandex.linkedList.linkedList_hasCycle.Solution.ListNode;

import static org.example.algo.yandex.linkedList.linkedList_hasCycle.Solution.hasCycle2;

public class Test {

    public static void main(String[] args) {
        //false
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(4);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;


        //true
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println(hasCycle2(n1));
    }
}
