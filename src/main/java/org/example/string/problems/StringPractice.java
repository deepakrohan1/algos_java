package org.example.string.problems;

public class StringPractice {

    static int convertfive(int num) {

        int mulFact = 1;
        int div = num;
        int mod = num%10;
        int fin = 0;

        while (div != 0) {
            mod = div % 10;

            div = div / 10; //10 1


            System.out.println(String.format("div %s mod %s", div, mod));
            if (mod == 0) mod = 5;

            fin = mod * mulFact + fin; // 555

            mulFact = 10 * mulFact;

        }

        return fin;

        // Your code here
    }

    public static final void checkPattern(String s, String pattern) {
        int m = s.length();
        int n = pattern.length();

        for (int i = 0; i <= m - n; ) {
            int j;
            for (j = 0; j < n; j++) {
                if (pattern.charAt(j) != s.charAt(i + j)) break;
            }
                if (j == n)
                    System.out.println(i);
                if (j == 0)
                    i ++;
                else
                    i = i +j;
        }
    }

    public static void main(String[] args) {
        StringPractice.checkPattern("ROHAN", "AN");
        StringPractice.checkPattern("aaaaa", "aaa");
        System.out.println(StringPractice.convertfive(1004));
    }
}
