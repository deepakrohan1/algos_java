package org.example.linked;

public class LinkedList {
    Node head;
    Node tail;

    public Node pushNode(int data) {
        Node n = new Node(data);
        Node curr = head;
        if (head == null) return this.head = n;
        else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
        return this.head;
    }

    public Node pushSortedPosition (int data) {
        return this.head;
    }

    public Node getMiddle() {
        if (head == null) return null;
        Node slow = this.head;
        Node fast = this.head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public void printNodes() {
        Node curr = head;
        while (curr != null) {
            System.out.println("NodeData:" +curr);
            curr = curr.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "data" + data + ", next" +next;
    }
}
