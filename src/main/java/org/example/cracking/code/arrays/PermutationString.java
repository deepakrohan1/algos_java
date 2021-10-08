package org.example.cracking.code.arrays;

import java.util.HashMap;
import java.util.Map;

public class PermutationString {
    public boolean isPermutation(String input, String toCheck) {

        if (input.length() != toCheck.length())
            return false;

        Map<Character, Integer> wordMap = new HashMap<>();

        for(int i = 0; i < input.length(); i ++) {
            Character current = input.charAt(i);
            if (wordMap.containsKey(current))
                wordMap.put(current, wordMap.get(current) + 1);

            else
                wordMap.put(current, 1);
        }

        for (int i = 0; i < toCheck.length(); i ++) {
            Character current = input.charAt(i);
            if(wordMap.containsKey(current))
                wordMap.put(current, wordMap.get(current) - 1);
            else
                return false;
        }

        for(Character key : wordMap.keySet()) {
            if (wordMap.get(key) > 0 || wordMap.get(key) < 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        PermutationString ps = new PermutationString();
        System.out.println(ps.isPermutation("abcd", "abcd"));
    }
}
