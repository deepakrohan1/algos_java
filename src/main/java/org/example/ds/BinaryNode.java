package org.example.ds;

public class BinaryNode {

    int value;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                '}';
    }
}
