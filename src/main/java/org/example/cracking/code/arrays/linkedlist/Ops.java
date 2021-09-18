package org.example.cracking.code.arrays.linkedlist;

import org.example.cracking.code.arrays.linkedlist.helper.SingleLinkedList;
import org.example.cracking.code.arrays.linkedlist.helper.SingleLinkedNode;

public class Ops {

public SingleLinkedNode addToTheStart(SingleLinkedNode n , int val) {
    SingleLinkedNode newNode = new SingleLinkedNode();
    newNode.data = val;

    newNode.next = n;
    n = newNode;

    return n;
}
// 3    -> 4    -> 5
public SingleLinkedNode addNodeToEnd(SingleLinkedNode n, int k) {
    SingleLinkedNode sin = new SingleLinkedNode();
    sin.data = k;

    if ( n == null) return sin;

    SingleLinkedNode curr = n;
    while (curr.next != null) {
        curr = curr.next;
    }

    curr.next = sin;

    return n;
}

public SingleLinkedNode deleteAtBeginning(SingleLinkedNode n) {

    n = n.next;
    return n;

}
//  3 - 4 - 5 - 6
    public SingleLinkedNode deleteAtEnd(SingleLinkedNode n) {

    SingleLinkedNode curr = n;
    SingleLinkedNode prev = n;
    if (curr.next != null) {
        prev = curr;
        curr = curr.next;

    }
    prev.next = null;
    return n;
    }

    public static void main(String[] args) {
        SingleLinkedList n = new SingleLinkedList();
        Ops op = new Ops();
        System.out.println(op.addToTheStart(n.createNodes(), 1));
        System.out.println(op.addNodeToEnd(n.createNodes(), 1));
        System.out.println(op.deleteAtBeginning(n.createNodes()));
        System.out.println(op.deleteAtEnd(n.createNodes()));
    }
    
}
