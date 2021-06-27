package org.example.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParathensis {
	
	public boolean isBalanced(String str) {
	    if (str.length() == 0) {
	        return false;
        }
        Stack<Character> stackOfBrackets = new Stack<>();
        for (int i = 0; i < str.length(); i ++) {
            char toBeEval = str.charAt(i);
            if (toBeEval == '(' || toBeEval == '[' || toBeEval == '{') {
                stackOfBrackets.add(toBeEval);
            } else {
                if (stackOfBrackets.size() == 0) {
                    return false;
                }
                if (! isMatching(stackOfBrackets.peek(), toBeEval)) {
                    return false;
                } else {
                    stackOfBrackets.pop();
                }
            }
        }
        return true;
	}

	public boolean isMatching(Character a, Character b) {
	    return ( (a =='(' && b == ')') || (a =='[' && b == ']') || (a =='{' && b == '}'));
    }

    public boolean isBalancedSec(String input) {
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');

        Stack<Character> s = new Stack<>();
        /**
         IP : "[)", }}
         **/
        for (int i = 0; i< input.length(); i ++) {
            Character curr = input.charAt(i);   // [ ) }

            if(bracketMap.containsKey(curr)) {  // true false
                s.push(curr);                   // [
            } else {
                // Its a closing bracket

                if (s.size() == 0)
                    return false;

                while (s.size() != 0) {             //true false
                    Character popped = s.pop();     // [
                    if (bracketMap.get(popped).equals(curr)) {  //fale
                        break;
                    } else  {
                        return false;
                    }

                }

            }
        }

        return s.size() == 0;
    }
	
	public static void main (String[] args) {
		BalancedParathensis balancedParathensis = new BalancedParathensis();
        System.out.println(balancedParathensis.isBalancedSec("{}()"));
	}
}
