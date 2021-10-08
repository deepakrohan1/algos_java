package org.example.gog.arrays;

public class ReverseArray {

    public int[] reverseArray(int[] arr) {
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


        return  arr;
    }

    public static void main(String[] args) {
        ReverseArray rs = new ReverseArray();
//        int[] newOp = rs.reverseArray(new int[] {1,2,3,4,5,6});
        int[] newOp = rs.reverseArray(new int[] {1,2,3,4,6});
        for (int s: newOp             ) {
            System.out.println(s);

        }
    }
}
