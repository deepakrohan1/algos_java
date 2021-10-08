package org.example.edu.arrays;

public class ArraySetProblems {
    public static boolean sameFrequency(int num , int num2) {
        int[] arr = new int[10];
        while (num > 0) {
            int mod = num % 10;
            arr[mod] += 1;
            num = num / 10;
        }

        while (num2 > 0) {
            int mod = num2 % 10;
            arr[mod] -= 1;
            num2 = num2 / 10;
        }
        for (int i : arr) {
            if (i != 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameFrequency(182, 281));
        System.out.println(sameFrequency(34, 14));
        System.out.println(sameFrequency(3589578, 5879385));
        System.out.println(sameFrequency(22, 222));
    }
}
