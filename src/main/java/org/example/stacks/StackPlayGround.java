package org.example.stacks;

public class StackPlayGround {

    int[] arr;
    int cap;
    int top = -1;

    public StackPlayGround(int cap) {
        this.cap = cap;
        this.arr = new int[cap];
    }

    public void push(int element) throws Exception {
        top ++;

        if (top >= cap) {
            throw new Exception("Stack Overflow");
        }
        arr[top] = element;
    }

    public int pop() throws Exception {

        if (top <= -1 ) {
            throw new Exception ("Stack Underflow");
        }
        int temp = arr[top];
        arr[top] = 0;
        top --;

        return temp;

    }

    public int peek() throws Exception {
        if (top == -1) {
            throw new Exception("No elements in Stack");

        }

        return arr[top];
    }

    public int size() {
        return arr.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void printStack() {
        System.out.println();
        for (int i : this.arr) {
            System.out.print(i +"-");
        }
    }

    public static void main(String[] args) throws Exception {
        StackPlayGround stackPlayGround = new StackPlayGround(5);
        stackPlayGround.printStack();
        stackPlayGround.push(4);
        stackPlayGround.push(4);
        stackPlayGround.push(4);
        stackPlayGround.push(4);
        stackPlayGround.push(4);
        stackPlayGround.push(6);
//        stackPlayGround.push(4);
//        stackPlayGround.push(4);
//        System.out.println(stackPlayGround.peek());
//        System.out.println(stackPlayGround.pop());
//        System.out.println(stackPlayGround.pop());
        stackPlayGround.printStack();
    }


}
