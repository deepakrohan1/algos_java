package org.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public List<String> isAnagram( List<String> arr) {

        List<String> anagrams = new ArrayList<>();
        for(String word: arr) {
            boolean isA = true;

            for (int i = 0; i < word.length(); i ++) {
                int endSeq = word.length() - 1 - i;
                if (word.charAt(i) != word.charAt(endSeq) && i != endSeq) {
                    isA = false;
                    break;
                }
            }

            if (isA) {
                anagrams.add(word);
            }

        }



        return anagrams;
    }

    public static void main(String[] args) {
        String[] elements = new String[]{"radar", "civic", "AABAA", "Penguin"};
        List<String> seqList = Arrays.asList(elements);
        Palindrome p = new Palindrome();
        System.out.println(p.isAnagram(seqList));


    }
}
