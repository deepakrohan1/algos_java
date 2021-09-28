package org.example.cracking.code.arrays.linkedlist.helper;

import org.example.ds.SingleLinkedLinkList;

public class SingleLinkedList{

    public SingleLinkedNode createNodes() {
        SingleLinkedNode node = new SingleLinkedNode();
        node.data = 3;
        SingleLinkedNode node1 = new SingleLinkedNode();
        node1.data = 1;
        node.next = node1;
        SingleLinkedNode node2 = new SingleLinkedNode();
        node2.data = 1;
        node1.next = node2;
        SingleLinkedNode node3 = new SingleLinkedNode();
        node3.data = 1;
        node2.next = node3;
        return node;
    }

    public SingleLinkedNode getNode() {
        return this.createNodes();
    }

    public static void main(String[] args) {
        SingleLinkedList singleNodeLinkedList = new SingleLinkedList();
        System.out.println(singleNodeLinkedList.createNodes());
    }
}

