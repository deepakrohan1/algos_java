package org.example.sort;

public class BubbleSort {

    public int[] insertionSort(int[] arr) {
        for (int i =1; i < arr.length; i ++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > key; j --) {

                    arr[j+1] = arr[j];

            }
            arr[j+1] = key;

        }
        return arr;
    }

    public int[] selectioSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_ind] )
                    min_ind = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind]  = temp;
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++ ) {
            boolean swap = false;

            for (int j = 0; j < arr.length - i - 1; j ++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                System.out.println("j " +j);

            }
            System.out.println("i " +i);

            if (! swap) {
                break;
            }
        }

        return  arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
//        int[] s = bubbleSort.bubbleSort(new int[]{1,9,7,2});
//        int[] s = bubbleSort.bubbleSort(new int[]{1,2,4,6});
//        int[] s = bubbleSort.selectioSort(new int[]{1,2,4,6});
        int[] s = bubbleSort.insertionSort(new int[]{1,5,2,3});
        for (int n: s
             ) {
            System.out.println(n);
        }
    }
}
