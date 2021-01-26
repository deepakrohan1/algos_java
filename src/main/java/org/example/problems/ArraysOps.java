package org.example.problems;

public class ArraysOps {

    public int[] reverseArr(int[] arr) {
        int size = arr.length - 1;
        int[] newArr = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i --) {
            System.out.println(String.format("index %d newArr.length - 1 %d", i , newArr.length - i));
            newArr[newArr.length -1 - i] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        ArraysOps ops = new ArraysOps();
        System.out.println();
        int[] test = ops.reverseArr(new int[]{10, 2, 3, 4});
        for (int i : test) {

            System.out.println(i);
        };
    }
}
