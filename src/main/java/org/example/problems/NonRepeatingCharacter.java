package org.example.problems;

import java.util.*;

public class NonRepeatingCharacter {

    public Character firstUniqCharacter(String s) {

        Map<Character, Count> freqMap = new HashMap<>();
        int lowest = Integer.MAX_VALUE;

        for(int i = 0; i < s.length(); i ++) {
            char charToBeChecked = s.charAt(i);
            if (!freqMap.containsKey(charToBeChecked)) {
                Count c = new Count();
                c.startIndex = i;
                c.freq = 1;
                freqMap.put(charToBeChecked, c);
            } else {
                Count toBeUpdated = freqMap.get(charToBeChecked);
                toBeUpdated.freq += 1;
                freqMap.put(charToBeChecked, toBeUpdated);

            }
        }

        for (char c : freqMap.keySet()) {
                // need to iterate through list
                if (freqMap.get(c).freq == 1 && lowest > freqMap.get(c).startIndex) {
                    lowest = freqMap.get(c).startIndex;
                }
        }

        return s.charAt(lowest);
    }

    public static void main(String[] args) {
        NonRepeatingCharacter np = new NonRepeatingCharacter();
        System.out.println(np.firstUniqCharacter("aabbbc"));
        System.out.println(np.firstUniqCharacter("aaabcde"));
        System.out.println(np.firstUniqCharacter("abbcde"));
        System.out.println(np.firstUniqCharacter("abcde"));

    }
}

class Count {
    int startIndex;
    int freq;
}