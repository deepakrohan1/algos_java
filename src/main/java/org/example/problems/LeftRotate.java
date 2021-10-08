package org.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotate {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here

        /**
         * [1,2,3,4,5,6] #2
         [3,4,5,6,1,2]
         */
        List<Integer> arrNew = new ArrayList<>();
        for (int i = 0; i < d; i ++) {
            arrNew.add(a.get(i));
        }

        a.forEach((S) -> System.out.println(S));
        for (int i = d; i < a.size()  ; i++) { //2,3,4
            // int temp = a[i];
            System.out.println(a.size() +","+ i);
            int s = i-d;
//            System.out.println("==="+s);

            a.set(s, a.get(i));// 0,1,2,3,
        }
        System.out.println(a);

        int j = 0;

        for (int i = a.size()  - d; i < a.size() ; i ++) { // 5 - 1 - 2 => 2,
            a.set(i, arrNew.get(j));
            j ++;
        }

        return a;
    }

    public static void main(String[] args) {
        LeftRotate lf = new LeftRotate();
        System.out.println(lf.rotLeft(Arrays.asList(new Integer[] {1,2,3,4,5}), 2));
    }

}


