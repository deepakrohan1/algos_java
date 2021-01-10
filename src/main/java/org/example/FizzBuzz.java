package org.example;

import java.util.*;

public class FizzBuzz {
	
	public boolean isSquaredArr(Integer[] arr, Integer[] arrS) {
		Map<Integer, Integer> initial = new HashMap<>();
		Map<Integer, Integer> squared = new HashMap<>();
		for ( Integer i : arr ) {
			if(initial.containsKey(i)) {
				initial.put(i, initial.get(i) + 1);
			} else {
				initial.put(i,1);
			}
		}
		
		for ( Integer i : arrS ) {
			if(squared.containsKey(i)) {
                squared.put(i, initial.get(i) + 1);
			} else {
                squared.put(i,1);
			}
		}

        System.out.println(initial);
        System.out.println(squared);

		for (Map.Entry<Integer, Integer> entry: initial.entrySet()) {
//            System.out.println(entry);
            int i = (int) Math.round(Math.pow(entry.getKey(), 2));
			if ( ! (squared.containsKey(i))) {
				return false;
			}

			int j = (int) Math.round(Math.pow(entry.getKey(), 2));
			if (initial.get(entry.getKey()) != squared.get(j)) {
				return false;
			}
		}
		
		return true;
	}


	public boolean isAnagram(String s , String a2) {
		
		Map<String, Integer> s1 = new HashMap<>();
		Map<String, Integer> s2 = new HashMap<>();
		
		String[] sArr = s.split("");
		for (String letter : sArr) {
			if (s1.containsKey(letter)) {
				s1.put (letter, s1.get(letter) + 1);
			} else {
				s1.put(letter, 1);
			}
		}
		
		String[] s2Arr = a2.split("");
		for (String letter : s2Arr) {
			if (s2.containsKey(letter)) {
				s2.put (letter, s2.get(letter) + 1);
			} else {
				s2.put(letter, 1);
			}
		}

		if (s1.size() != s2.size()) {
		    return  false;
        }

		for (Map.Entry<String, Integer> e : s1.entrySet() ) {
			if (! s2.containsKey(e.getKey())) {
				return false;
			}
			
			if (s1.get(e.getKey()) != s2.get(e.getKey())) {
				return false;
			}
		}
		return true;

    }

    public static void main(String[] args) {
    	Integer[] s = {1,2,3,4};
		Integer[] ss = {1,4,9,16,1};
		
		FizzBuzz f = new FizzBuzz();
//		System.out.println(f.isSquaredArr(s, ss));
		System.out.println(f.isAnagram("abc a", "aacb"));
		
    }
}
