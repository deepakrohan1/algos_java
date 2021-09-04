package org.example.problems;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public String pairSum(int[] x, int sum) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < x.length; i ++ ) {
            int diff = sum - x[i];
            if (freqMap.containsKey(diff)) {
                return i +","+ freqMap.get(diff);
            } else {
                freqMap.put(x[i], i);
            }
        }

        return "-1";
    }

    public int getTheMaxSum(int[] x) {
        int maxSum = x[0], currSum = x[0];
        for(int i = 1; i < x.length; i++) {
//            currSum = currSum + x[i];
//            if (currSum < 0) {
//                currSum = 0;
//            }
            currSum = Math.max(currSum + x[i], x[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        PairSum pairSum = new PairSum();
        System.out.println(pairSum.pairSum(new int[] {1,9,2,3,7}, 1));
        System.out.println(pairSum.getTheMaxSum(new int[] {1,9,-100,3,8}));
        System.out.println(pairSum.getTheMaxSum(new int[] {2,3,-8,7,-1,2,3}));
        String s ="hello";
        System.out.println(s.contains("ll"));
        System.out.println(s.contains("le"));
    }
}