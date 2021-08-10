package org.example.problems;

import java.util.Arrays;

public class RemoveDuplicatesSorted {

    public int removeDuplicates(int[] nums) {
        int swap = 0;
        int j = 0;
        for (int i = 1; i < nums.length;) {
             // Does this always work?
            while (j < nums.length) {
                System.out.println("i:" + i + ",j:"+ j);

              if(nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    swap ++;
                    j++;
                    break;

                }
                j ++;


            }
            i ++;
        }

        for (int num : nums) {
            System.out.println("nums = " + Arrays.toString(nums));
        }
        return swap;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSorted removeDuplicatesSorted = new RemoveDuplicatesSorted();
        System.out.println(removeDuplicatesSorted.removeDuplicates(new int[]{0,1,1,1,2,2,3,3,4}));

    }
}
