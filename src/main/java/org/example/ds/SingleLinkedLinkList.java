package org.example.ds;

import java.sql.SQLOutput;

public class SingleLinkedLinkList {
    Node head;
    Node tail;
    int length;


    public void push(String data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }

        length ++;
    }

    public void traverseList() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println("Node::"+ currentNode);
            currentNode = currentNode.next;
        }
        System.out.println("Length::" +length);
    }

    public void pop() throws Exception {
        Node currentNode = head;
        Node prevNode = null;
        if (currentNode == null) {
            throw new Exception("Head is Null");
        } else {
            while (currentNode.next != null) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }

            prevNode.next = null;
            this.tail = prevNode;
            length --;
        }
    }

    public void shiftList() {
        Node currentNode = head;
        if (currentNode != null) {
            Node newHead = head.next;
            this.head = newHead;
            length --;
        }
    }

    public void unshift(String data) {
        /**
         * 1. Add element to the beginning of the list
         * 2. Create a tempVariable to hold the new Node
         * 3. Assign the newNode. next = head
         * 4. head = newNode
         * 5. if no head is present assign this to the be the head
         * 5. length ++
         *
         */
    }


    public static void main(String[] args) {
        SingleLinkedLinkList s = new SingleLinkedLinkList();
        s.push("a");
        s.push("c");
        s.push("d");
        s.traverseList();
        try {
            s.pop();
        }catch ( Exception e) {

        }
        System.out.println("=========");
        s.traverseList();
        System.out.println("=========");

        s.shiftList();
        s.traverseList();
    }
}
