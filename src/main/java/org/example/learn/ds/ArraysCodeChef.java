package org.example.learn.ds;

import java.util.ArrayList;
import java.util.List;

public class ArraysCodeChef {

    public static int sqRt(int number) {
        if (number == 0) {return 0;}
        int min = 0;
        int low = 1, high = number;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid < number) {
                low = mid + 1;
                min =mid;
            } else if (mid * mid > number) {
                high = mid - 1;
            } else {
                return mid;
            }
        }



        return min;
    }

    public static void main(String[] args) {
        System.out.println(sqRt(82));
        System.out.println(sqRt(15));
        System.out.println(sqRt(9));
    }

}
