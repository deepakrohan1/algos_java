package org.example.stacks;

import org.example.stack.IStack;

public class LinkedListStack implements IStack {

    Node head = new Node (-1);
    Node curr = head;
    int size = 0;

    @Override
    public void push(int data) {
        curr.next = new Node(data);
        curr = curr.next;
        size ++;
    }

    /**
     * TODO Feel convoluted
     * @return
     */

    @Override
    public int pop() {
        // TODO Failing on extra pop
        int data = 0;
        if (curr != null)
             data = curr.data;
        Node temp = head.next;
        Node prevNode = temp;
        while (temp != null) {
            if (temp.data == data) {
               break;
            } else {
                prevNode = temp;
                temp = temp.next;
            }
        }
        if (curr != null) {
            if (size == 1) {
                head.next = null;
                curr = null;
                return data;
            }
            temp = prevNode;
            temp.next = null;
            curr = temp;
            size--;
            return data;
        }
        return Integer.MIN_VALUE;

    }

    @Override
    public int peek() {
        return curr.data;
    }

    @Override
    public void print() {
        Node temp = head.next;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.data +"-");
            temp = temp.next;
        }

    }

    @Override
    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        LinkedListStack stackPlayGround = new LinkedListStack();
        stackPlayGround.print();
        stackPlayGround.push(1);
        stackPlayGround.push(2);
        stackPlayGround.push(3);
        stackPlayGround.push(4);
        stackPlayGround.push(5);
        stackPlayGround.push(6);
//        stackPlayGround.push(4);
//        stackPlayGround.push(4);
        System.out.println(stackPlayGround.peek());
        System.out.println("===");

        System.out.println(stackPlayGround.pop());
        System.out.println(stackPlayGround.pop());
        System.out.println(stackPlayGround.pop());
        System.out.println(stackPlayGround.pop());
        System.out.println(stackPlayGround.pop());
//        System.out.println(stackPlayGround.pop());
//        System.out.println(stackPlayGround.pop());
//        System.out.println(stackPlayGround.pop());
        stackPlayGround.print();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
