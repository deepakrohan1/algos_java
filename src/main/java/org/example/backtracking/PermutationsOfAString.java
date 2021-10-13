package org.example.backtracking;


public class PermutationsOfAString {

    public static void printAllPermutations(String s) {

        recursiveFunction(s, 0, s.length() - 1);

    }

    static void recursiveFunction (String res, int left, int right) {
        if (left == right) System.out.println(res);

        else {
            for (int i = left ; i <= right ; i++) {
                res = swap (res, left, i);
                recursiveFunction(res, left + 1, right);
                res = swap(res, left, i);
            }
        }
    }

    private static String swap(String res, int left, int i) {
        char[] charA =  res.toCharArray();
        char temp = charA[left];
        charA[left] =  charA[i];
        charA[i] = temp;

        return String.valueOf(charA);
    }

    public static void main(String[] args) {
        printAllPermutations("abc");
    }

}
