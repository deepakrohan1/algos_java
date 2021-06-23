package org.example.stack;

public class GreatestPrevElement {

    public int[] naiveSolutionForPrevGtElement(int[] arr) {
        int[] gtArr = new int[arr.length];
        // since no prev elements are there
        gtArr[0] = -1;

        for (int i =1; i < arr.length; i ++) {
            for (int j = i; j >=0; j --) {
                if (arr[j] > arr[i]) {
                    gtArr[i] = arr[j];
                    break;
                }
            }

            // No more gt element found
            if(gtArr[i] == 0) {
                gtArr[i] = -1;
            }
        }

        return gtArr;
    }

    public static void main(String[] args) {
        GreatestPrevElement gt = new GreatestPrevElement();
        int[] inputArr = {15, 10, 8 , 12, 20, 3, 9, 1};

        int[] outArr= gt.naiveSolutionForPrevGtElement(inputArr);

        for (int i : outArr) {
            System.out.println(i);
        }
    }
}
