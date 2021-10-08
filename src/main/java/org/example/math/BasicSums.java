package org.example.math;

public class BasicSums {


    public static int sumOfDigits(int n) {
        if (n == 0) return 0;


        return n % 10 + sumOfDigits(n / 10);
    }

    /**
     *  Recursion to get the power of a number
     * @param number
     * @param exp
     * @return
     */

    public static int powOfNumber (int number, int exp) {
        if (exp <= 0) return 1;

        return number * powOfNumber(number, exp -1);
    }

//     TODO CHeck this
    public static int maxSubArraySum(int[] arr, int num) {
        int maxSum = 0;
        for (int i = 0; i < num; i++) {
            maxSum += arr[i];
        }

        for (int i = 1; i <= arr.length - num; i++) {
            int currentSum = maxSum - arr[i - 1];
            currentSum += arr[i + num -1];
            maxSum = Math.max(currentSum,maxSum);
        }

        return maxSum;
    }

    public static boolean isAverageFound(int[] arr, Double average) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            Double avgC = (arr[low] + arr[high]) / 2d;
            if (avgC < average) low ++;
            else if (avgC > average) high--;
            else return true;
        }

        return false;
    }

    public static boolean isSameFreq(int i, int j) {
        int[] arr = new int[10];
        while(i > 0) {
            int mod = i % 10;
            arr[mod] += 1;
            i = i/10;
        }
        while(j > 0) {
            int mod = j % 10;
            arr[mod] -= 1;
            j = j/10;
        }

        for (int l : arr) {
            if (l > 0 || l < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isSameFreq(113, 321));
//        System.out.println(isAverageFound(new int[] {}, 4d));
//        System.out.println(maxSubArraySum(new int[] {100,200,300,400}, 2));
//        System.out.println(maxSubArraySum(new int[] {1,4,2,10,23,3,1,0,20}, 4));
//        System.out.println(maxSubArraySum(new int[] {3,-2,7,-4,1,-1,4,-2,1}, 2));
//        System.out.println(powOfNumber(3,3));
        System.out.println(sumOfDigits(2993));

    }
}
