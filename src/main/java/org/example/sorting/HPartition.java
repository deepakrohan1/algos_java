package org.example.sorting;

public class HPartition {

    public int HPartAlg(int[] arr) {

        int pivot = arr[0];
        int i = -1;
        int j = arr.length ;

        while(true) {
            do {
                i ++;
            } while (arr[i] < pivot);

            do {
                j --;
            } while (arr[j] > pivot);


gs            if (i == j) {
                for (int i1 : arr) {
                    System.out.println(i1);
                }
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }



    }

    public static void main(String[] args) {
        HPartition h = new HPartition();
        System.out.println(h.HPartAlg(new int[] {5,3,8,4,2,7,1,10, 0}));

    }

}
