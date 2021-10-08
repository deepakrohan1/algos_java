package org.example.leet;

public class ArrayMerge {
    /**
     *
     *
     */

    public int[] mergeArr(int[] arr1, int[] arr2, int m, int n) {
        int i = m - 1;
        int j = n - 1;

        int k = arr1.length - 1;
// 1 2 3 0 0 || 2 4 5
        while ( i >= 0 || j >= 0) {


            if ((arr2[j] > arr1[i]) ) {
                arr1[k] = arr2[j];
                k --;

                j--;
            } else if ((arr2[j] < arr1[i]) )  {
                arr1[k] = arr1[i];
                k --;

                i --;
            } else {
                i --;
                j --;
                k --;
            }

            if (  j < 0)
                break;

        }


        return arr1;
    }


    public static void main(String[] args) {
        ArrayMerge arrayMerge = new ArrayMerge();

        int[] fin = arrayMerge.mergeArr(new int[]{1,2,3 ,0,0, 0}, new int[] {2,4,5}, 3, 3);
        for (int i = 0; i < fin.length; i++) {
            System.out.println(fin[i]);
        }
    }
}
