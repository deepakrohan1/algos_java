package org.example.cracking.code.arrays.linkedlist;

import org.example.cracking.code.arrays.linkedlist.helper.SingleLinkedList;
import org.example.cracking.code.arrays.linkedlist.helper.SingleLinkedNode;

public class Ops {

    public SingleLinkedNode addToTheStart(SingleLinkedNode n, int val) {
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

        if (n == null) return sin;

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

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;

        return n;
    }

    public SingleLinkedNode sortedInsert(SingleLinkedNode n, int data) {

        SingleLinkedNode temp  = new SingleLinkedNode();
        temp.data = data;
        SingleLinkedNode curr = n;
        SingleLinkedNode prev = curr;
        if (n == null) return temp;
        if (n.data >= data) {
            temp.next = n;
            n = temp;
            return n;
        }

        while (curr != null) {
            if (curr.data >= data) {
                prev.next = temp;
                temp.next = curr;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        prev.next = temp;

        return n;
    }

    public SingleLinkedNode removedDuplicates (SingleLinkedNode head) {
        SingleLinkedNode curr = head;

        while (curr != null) {

            SingleLinkedNode n = curr;
            while (n.next != null && curr.data == n.next.data) {
                n = n.next;
            }
            curr.next = n.next;

            curr = curr.next;
        }
        return head;
    }


    public static void main(String[] args) {
        SingleLinkedList n = new SingleLinkedList();
        Ops op = new Ops();
//        System.out.println(op.addToTheStart(n.createNodes(), 1));
//        System.out.println(op.addNodeToEnd(n.createNodes(), 1));
//        System.out.println(op.deleteAtBeginning(n.createNodes()));
//        System.out.println(op.deleteAtEnd(n.createNodes()));
//        System.out.println(op.sortedInsert(n.createNodes(), 7));
//        System.out.println(op.sortedInsert(n.createNodes(), 2));
//        System.out.println(op.sortedInsert(n.createNodes(), 3));
//        System.out.println(op.sortedInsert(n.createNodes(), 9));
//        System.out.println(op.sortedInsert(n.createNodes(), 10));
        System.out.println(op.removedDuplicates(n.createNodes()));
    }

}
