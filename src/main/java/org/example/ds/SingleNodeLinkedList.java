package org.example.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A problem given a set of nodes  {1, 4, 2, 3, 2} => return the uniq nodes
 */

public class SingleNodeLinkedList {

    SingleLinkedNode head;

    public SingleLinkedNode addNode(int data) {
        SingleLinkedNode currentNode = this.head;
        SingleLinkedNode newNode = new SingleLinkedNode();
        newNode.data = data;
        if (this.head == null) {
            this.head = newNode;
        } else  {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;

        }
        return this.head;
    }

    public SingleLinkedNode compressListSingle (SingleLinkedNode head) {
        SingleLinkedNode currentNode = head;
        SingleLinkedNode prevNode = head;
        Set<Integer> data = new HashSet<>();
        while (currentNode != null) {
            if (data.contains(currentNode.data)) {
                prevNode.next = currentNode.next;
                currentNode = prevNode.next;
            } else {
                data.add(currentNode.data);
                currentNode = currentNode.next;
                prevNode = prevNode.next;
            }
            System.out.println("======"+head);
            System.out.println(currentNode);

        }
        return head.next;
    }

    public SingleLinkedNode compressList(SingleLinkedNode head) {
        SingleLinkedNode node = head; // Only for iteration
        SingleLinkedNode dummy = head;
        dummy.data = 0;
        dummy.next = head;
        SingleLinkedNode previous = dummy;
        Set<Integer> appear = new HashSet<>();
        while (node != null) {
            if (appear.contains(node.data)) {
                previous.next = node.next;
                node = previous.next;
            } else {
                appear.add(node.data);
                node = node.next;
                previous = previous.next;
            }
        }
        System.out.println(dummy.next);
        return dummy.next;

    }

    public void printNodes(SingleLinkedNode node) {

        while (node != null && node.next != null) {
            System.out.println("Node" +node.data);
            node = node.next;
        }
    }

    public void printNodes() {
        SingleLinkedNode node = this.head;
        while (node != null && node.next != null) {
//            System.out.println("Node" +node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked List
        SingleNodeLinkedList singleNodeLinkedList = new SingleNodeLinkedList();
        int[] i = new int[]{1,2,2,4,3,4,1};
        for (int l: i  ) {
            singleNodeLinkedList.addNode(l);
        }
        singleNodeLinkedList.printNodes();

        System.out.println(singleNodeLinkedList.head);
        System.out.println(singleNodeLinkedList.compressListSingle(singleNodeLinkedList.head));
        System.out.println(singleNodeLinkedList.compressList(singleNodeLinkedList.head));
    }
}

/**
 * Class for this
 **/

class SingleLinkedNode {
    int data;
    SingleLinkedNode next;

    @Override
    public String toString() {
        return "SingleLinkedNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

