package org.example.algo.merge_2_sorted_lists;

public class Test {

    public static void main(String[] args) {
//        ListNode list1_1 = new ListNode(1);
//        ListNode list1_2 = new ListNode(2);
//        ListNode list1_3 = new ListNode(4);
//        list1_1.next = list1_2;
//        list1_2.next = list1_3;
//
//
//        ListNode list2_1 = new ListNode(1);
//        ListNode list2_2 = new ListNode(3);
//        ListNode list2_3 = new ListNode(4);
//        list2_1.next = list2_2;
//        list2_2.next = list2_3;


        ListNode list1_1 = new ListNode(-9);
        ListNode list1_2 = new ListNode(3);
        list1_1.next = list1_2;


        ListNode list2_1 = new ListNode(5);
        ListNode list2_2 = new ListNode(7);
        list2_1.next = list2_2;

        System.out.println(Solution.mergeTwoLists(list1_1, list2_1));
    }
}
