package org.example.linked;

public class TestMethodsOnSingleLinkedList {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        System.out.println(l.pushNode(10));
        System.out.println(l.pushNode(20));
        System.out.println(l.pushNode(21));
        System.out.println(l.pushNode(22));
        System.out.println(l.pushNode(23));
        System.out.println();
        System.out.println(l.getMiddle());
//        l.pushSortedPosition(22);
//        l.printNodes();
//        l.pushSortedPosition(11);
//l.printNodes();
    }
}
