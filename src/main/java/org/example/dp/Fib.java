package org.example.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses memoization
 */
public class Fib {

    int[] arrOfReference = new int[8];
    public int fibSeries(int n) {
        if (n <= 2)
            return 1;

            return fibSeries(n-1) + fibSeries(n-2);
    }

    public int fibSeriesOptimization (int n) {
            if (arrOfReference[n] == 0) {
                if (n <= 2) {
                    return 1;
                }
                 arrOfReference[n] = fibSeriesOptimization(n-1) + fibSeriesOptimization(n-2);
                return arrOfReference[n];

            } else {
                return arrOfReference[n];
            }


    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.fibSeries(6));
        System.out.println(fib.fibSeriesOptimization(7));


    }
}
