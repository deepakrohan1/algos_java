package org.example.cracking.code.arrays;

public class OneChange {

    public boolean isOneUpdate(String input, String test) {
        boolean oneChange = false;
        if (input.length() - test.length() > 1 || input.length() - test.length() < -1)
            return false;

        String stringToUse = input.length() >= test.length() ? input : test;

        for (int i = 0; i<  input.length(); i++) {

        }


        return oneChange;
    }
}
