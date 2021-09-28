package org.example.gog.arrays.search;

public class Problems {

    /**
     * Count number of 1's
     * [0,0,0,1,1,1,1]
     */

    public static int countOnes(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid > 0 && arr[mid] == 1 && arr[mid-1] == 1) high = mid - 1;
                else return arr.length - mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1}, n = 6;


        System.out.println(countOnes(arr));
    }
}
