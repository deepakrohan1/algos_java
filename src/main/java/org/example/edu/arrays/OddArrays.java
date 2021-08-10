package org.example.edu.arrays;

public class OddArrays {

    public  int[] removeEven(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i ++) {
            if(arr[i] % 2 != 0) {
                arr[count] = arr[i];
                count ++;
            } else {
                arr[count] = arr[i];
            }
        }

        int newArr[] = new int[count];
        for (int i = 0; i< count; i ++) {
            System.out.println(count +"  "+i);
            newArr[i] = arr[i];
        }

        // Write - Your - Code- Here
        return newArr; // change this and return the correct result array
    }

    public static void main(String[] args) {
        OddArrays odd = new OddArrays();
        int s[] = odd.removeEven(new int[] {1,3,2,4,7,9,8});
        for (int si: s) {
            System.out.println(si);
        }
        System.out.println();
    }
}
