package org.example.cracking.code.arrays;

import java.util.Arrays;

/**
 * aabbcccaa =>  a2b2c3a2
 */
public class StringCompression {


//    geeksForgeeks

    /**
     * g, 1+1
     *
     */

    public static String createCompressedString(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i ++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count ++;
            } else  {
                sb.append(input.charAt(i - 1) + "" + count);
                count = 1;
            }
        }


        return sb.toString();
    }
//Arrays.asList(StringCompression)
    public static long solution(long[] prices) {
        // Type your solution here
        long profit = 0;

        for (int i = 1; i < prices.length; i ++) {
            if (prices[i] > prices[i-1])  {
                profit = Math.max(profit, (prices[i] - prices[i-1]));
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(createCompressedString("aabbbcc"));
    }
}
