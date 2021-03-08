package org.example.ds;

/**
 * A problem given a set of nodes  {1, 4, 2, 3, 2} => return the uniq nodes
 */

public class SingleNodeLinkedList {

    SingleLinkedNode head;

    public SingleLinkedNode addNode(int data) {
        SingleLinkedNode currentNode = this.head;
        SingleLinkedNode newNode = new SingleLinkedNode();
        newNode.data = data;
        System.out.println("=====");
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

    public SingleLinkedNode compressList(SingleLinkedNode node) {

    }

    public void printNodes() {

        while (head != null && head.next != null) {
            System.out.println("Node" +head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked List
        SingleNodeLinkedList singleNodeLinkedList = new SingleNodeLinkedList();
        int[] i = new int[]{1, 2, 5, 4, 3, 4};
        for (int l: i  ) {

            singleNodeLinkedList.addNode(l);

        }
        singleNodeLinkedList.printNodes();
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