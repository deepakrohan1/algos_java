package org.example.problems;

public class BubbleSort {

    public int[] sort(int[] arr) {
        /**
         *  10,5,3,1,2
         *  loops between 5 and 2
         */
        for (int i = arr.length; i > 0; i--) {
            /**
             * this makes sure i is last 4
             */
            for (int j = 0; j < i -1; j ++) {
                if (arr[j] > arr[j+1]) {
                    /**
                     * Classic reassignment
                     */
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }

    public void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] s = b.sort(new int[] {10,5,3,1,2});
        b.print(s);
    }
}
