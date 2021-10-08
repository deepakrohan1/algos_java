package org.example.edu.arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element) {

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if ( arr[mid] < element) {
                i = mid + 1;
            } else if ( arr[mid] > element) {
                j = mid - 1;
            }
        }

        return -1;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;

        Character first = s.charAt(0);
        Character last = s.charAt(s.length() - 1);
        if (first == last)
            return true;
        else if (first != last)
            return false;

        return isPalindrome (s.substring(1, s.length()));
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(new int[] {1,2,3,4,5,6,9,10}, 10));
        System.out.println(BinarySearch.isPalindrome("rorp"));
    }
}
