package org.example.math;


public class FizzBuzz {

    public void printAllFizzBuzz(int number) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i <= number; i ++) {

            if (i % 3 == 0) {
                str.append("Fizz");
            }
            if (i % 5 == 0) {
                str.append("Buzz");
            }

            if (str.length() > 0) {
                System.out.println(String.format("Number %d is %s", i, str.toString()));
                str.setLength(0);
            }
        }
    }

    public static void main(String[]  args) {
        FizzBuzz fizzBuz = new FizzBuzz();
        fizzBuz.printAllFizzBuzz(15);
    }
}
