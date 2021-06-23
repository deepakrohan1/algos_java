package org.example.problems;

import java.sql.SQLOutput;

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

        public int getLargerstNumber(int[] numberArr) {
            int largest = Integer.MIN_VALUE;

            for (int i = 0; i < numberArr.length; i ++) {
                if (numberArr[i] > largest) {
                    largest = numberArr[i];
                }
            }

            return largest;
        }

    public int findSecondLargestElement(int[] arr) {
        int firstLargestElement = Integer.MIN_VALUE;
        int secondLargestElement = 0;

        for (int i = 0; i< arr.length; i++ ) {
            if (arr[i] > firstLargestElement) {
                secondLargestElement = firstLargestElement;

                firstLargestElement = arr[i];
            }
        }
        System.out.println(firstLargestElement + " " + secondLargestElement);

        if (firstLargestElement != secondLargestElement) {
            return secondLargestElement;
        } else
            return -1;
    }

    public int[] reverseTheArray(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }

        return a;
    }

    public static void main(String[] args) {
        ArraysOps ops = new ArraysOps();
        System.out.println();
        int[] test = ops.reverseArr(new int[]{10, 2, 3, 4});
        for (int i : test) {

            System.out.println(i);
        };
        System.out.println("======== LARGEST");
        System.out.println(ops.getLargerstNumber(new int[] {0,0,0}));

        System.out.println("======== SEC LARGEST");
        System.out.println(ops.findSecondLargestElement(new int[] {12, 12 ,12 , 12,12}));

        System.out.println("======== REV ARRAY");
        int[] s = ops.reverseTheArray(new int[] {13, 14 ,15 ,14, 16,17});
        for ( int  i:  s) {
            System.out.println(i);
        }
    }
}
