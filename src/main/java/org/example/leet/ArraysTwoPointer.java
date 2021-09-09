package org.example.leet;


/**
 * Solve by Two Pointers
 */
public class ArraysTwoPointer {

    /**
     * [-4, -1, 0 , 3, 9] =>  [0, 1, 9, 16, 81]
     *  1. Iterate using two pointers 0, arr.length - 1 (j , k)
     *  2. init a new tempArr [arr.length]
     *  3. fill the tempArr from right most pick the max value from j and k indexes
     * @param nums
     * @return
     */
    public static int[] sortedSquares(int[] nums) {
        int j = 0;
        int k = nums.length  -1 ;
        int[] nwArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newMax = 0;
            if (Math.abs(nums[j]) >  Math.abs(nums[k])) {
                newMax = j;
                j ++;
            } else  {
                newMax = k;
                k--;
            }
            nwArr[nums.length - 1 - i] = nums[newMax] * nums[newMax];
        }
        return nwArr;
    }

    /**
     * PS: [1,1,1,2] => 2, [] => 0, [2,4,7] => 3
     * Two pointer pattern
     * @param nums
     * @return
     */
    public static int countUniqValues(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int count = 1;
        int current = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != nums[current]) {
                count++;
                current = i;
            }
        }

        return count;
    }

    /**
     * Pub
     * @param
     */
    public static String generateStringFromEncoded(String s) {

//        input string 2a2b2c3d
        StringBuilder sb = new StringBuilder();
        int numberLoc = 0;
        int wordLoc = 1;
        while (wordLoc < s.length()) { // 1 3 5  || 0 2 4
            Integer number = Integer.parseInt(s.charAt(numberLoc)+"");
            Character word = s.charAt(wordLoc);

            for (int i = 0; i < number; i ++) {
                sb.append(word);
            }

            numberLoc += 2;
            wordLoc += 2;


        }

        return (sb.toString());
        }

    public static void main(String[] args) {
        int[] newArr = ArraysTwoPointer.sortedSquares(new int[] {-4, -1, 0, 3});
        System.out.println(ArraysTwoPointer.generateStringFromEncoded("2a2b2c3d"));
        System.out.println(ArraysTwoPointer.countUniqValues(new int[] {0,0,1,2,3,4,4,4}));
    }
}
