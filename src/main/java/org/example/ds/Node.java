package org.example.ds;

public class Node {
    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    String data;
    Node next;

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                '}';
    }
}
