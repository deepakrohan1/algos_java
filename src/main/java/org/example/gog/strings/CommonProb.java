package org.example.gog.strings;

public class CommonProb {
    /**
     * Is Subsequence
     */

    public static boolean isSubsequence (String s1, String s2) {
        int i = 0;
        int j = 0;
        if (s2.length() == 0) return true;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i ++;j ++;
            } else i ++;
        }

        return (j == s2.length());
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("ROGUE", "RU"));
    }
}
