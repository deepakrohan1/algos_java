package org.example.stack;

/**
 * TODO Reformat this code to include exceptions and SysExits
 */
public class TwoStacksInArray {

    Integer[] twoStacksArr = new Integer[10];
    int stackOnePointer = -1;
    int stackTwoPointer = twoStacksArr.length;

    public void push1(int data) {
        if (stackOnePointer < stackTwoPointer) {
            stackOnePointer ++;
            twoStacksArr[stackOnePointer] = data;
        } else {
            throw new StackOverflowError("Stack1 overflow");
        }
    }

    public int pop1() {
        int number;
        if (stackOnePointer >= 0) {
            number = twoStacksArr[stackOnePointer];
            twoStacksArr[stackOnePointer] = null;
            stackOnePointer --;
            return number;
        } else {
            throw new StackOverflowError("Stack has no elements");
        }
    }

    public int size1() {
        return stackOnePointer + 1;
    }

    public int peek1() {
        int number;
        if (stackOnePointer >= 0) {
            number = twoStacksArr[stackOnePointer];
            return number;
        } else {
            throw new StackOverflowError("Stack has no elements");
        }
    }

    public void push2(int data) {
        if (stackTwoPointer > stackOnePointer) {
            stackTwoPointer --;
            twoStacksArr[stackTwoPointer] = data;
        } else {
            throw new StackOverflowError("Stack overflow exception");
        }

    }

    public int pop2() {
        int number;
        if (stackTwoPointer < twoStacksArr.length) {
            number = twoStacksArr[stackTwoPointer];
            twoStacksArr[stackTwoPointer] = null;
            stackTwoPointer ++;
            return number;
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack 2 is underflow");
        }
    }

    public int size2() {
        return twoStacksArr.length - stackTwoPointer;
    }

    public int peek2() {
        int number;
        if (stackTwoPointer < twoStacksArr.length) {
            number = twoStacksArr[stackTwoPointer];
            return number;
        } else {
            throw new ArrayIndexOutOfBoundsException("No enough elements to peek");
        }
    }


    public static void main(String[] args) {

        TwoStacksInArray twoStacksInArray = new TwoStacksInArray();
        twoStacksInArray.push1(10);
        twoStacksInArray.push2(12);
        twoStacksInArray.push2(12);
        twoStacksInArray.push2(12);
        twoStacksInArray.push2(12);
        twoStacksInArray.push2(12);
        twoStacksInArray.push1(11);
        twoStacksInArray.push1(11);
        twoStacksInArray.push1(11);
        twoStacksInArray.push1(19);
        System.out.println(twoStacksInArray.stackOnePointer);
        System.out.println(twoStacksInArray.stackTwoPointer);
        System.out.println(twoStacksInArray.size1());
        System.out.println(twoStacksInArray.size2());
        System.out.println(twoStacksInArray.peek1());
        System.out.println("====================");
        System.out.println(twoStacksInArray.pop1());
        System.out.println(twoStacksInArray.pop2());
        System.out.println(twoStacksInArray.pop1());
        System.out.println(twoStacksInArray.pop2());
        System.out.println(twoStacksInArray.pop1());
        System.out.println(twoStacksInArray.pop2());
        System.out.println(twoStacksInArray.pop1());
        System.out.println(twoStacksInArray.pop2());
        System.out.println(twoStacksInArray.pop1());
        System.out.println(twoStacksInArray.pop2());
        System.out.println(twoStacksInArray.size1());
        System.out.println(twoStacksInArray.size2());

    }
}
