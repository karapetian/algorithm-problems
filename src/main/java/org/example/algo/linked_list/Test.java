package org.example.algo.linked_list;

public class Test {

    public static void main(String[] args) {
        NodesList linkedList = new NodesList();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.printNodesList();

        System.out.println("----------");
        linkedList.updateSpecificPosition(222, 2);
        linkedList.printNodesList();

        System.out.println("----------");
//        linkedList.deleteByPosition(2);
        linkedList.deleteByValue(222);
        linkedList.printNodesList();
    }
}
