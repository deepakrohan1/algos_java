package org.example.recursion;

public class RecursionPractice {

    /**
     * Print 1 to N number
     * @param number
     */
    public void printNumberOneToN(int number) {
        if (number == 0) 
          return;
        
        System.out.println(number);
        printNumberOneToN (number - 1);
    }

    public void printNumberNToOne(int n) {
        if (n == 0) {
            return;
        }
    
        printNumberNToOne(n-1);
        System.out.println(n);
    
    }

    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == (s.charAt(s.length()-1))) {
            return isPalindrome(s.substring(1, s.length() - 1));

        }
        return false;
    }

//    public boolean isPalindrome(String s) {
//        if (s.length() == 0 || s.length() == 1 )
//            return true;
////        System.out.println(s.substring(1,s.length() - 1));
//        return (s.charAt(0) == s.charAt(s.length() - 1) &&
//                isPalindrome(s.substring(1, s.length() - 1)));
//    }

    public int sum(int n) {
        if (n == 0)
            return 0;

        return sum(n/10) + n % 10;
    }

    public static void main(String[] args) {
        RecursionPractice recursion = new RecursionPractice();
        recursion.printNumberOneToN(5);
        recursion.printNumberNToOne(5);
        System.out.println(recursion.isPalindrome("wow"));
        System.out.println(recursion.sum(03));
    }

}
