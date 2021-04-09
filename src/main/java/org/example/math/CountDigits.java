package org.example.math;

public class CountDigits {

    public int countDigitsInNumber(Long number) {

        int count = 0;

        if (number == 0) {
            return count;
        }

        Long digits = number;

        while (digits > 0) {
            count ++;
            digits = digits / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigits cd = new CountDigits();
        System.out.println(cd.countDigitsInNumber(1223348989889894456L));
    }
}
