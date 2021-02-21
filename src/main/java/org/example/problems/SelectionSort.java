package org.example.problems;

public class SelectionSort {

    public int[] sort(int[] arr) {

        for(int i =0 ; i < arr.length; i ++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            if ( i != min) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] i = s.sort(new int[] {10,2,1,4});
        for(int j : i) {
            System.out.println(j);
        }
    }
}
