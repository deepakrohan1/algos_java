package org.example.cracking.code.arrays;


/**
 * Finding Duplicates in a string provided no additional data structure
 */
public class FindingDuplicatesString {

    public boolean isDuplicatePresent(String input) {
        boolean[] arr = new boolean[128];

        for (int i =0 ; i < input.length(); i ++) {
            int current = input.charAt(i);
            if (arr[current]) {
                return true;
            } else
                arr[current] = true;
        }

        return false;
    }

    public static void main(String[] args) {
        FindingDuplicatesString fd = new FindingDuplicatesString();
        System.out.println(fd.isDuplicatePresent(""));
    }
}
