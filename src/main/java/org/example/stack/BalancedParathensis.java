package org.example.stack;

import java.util.Stack;

public class BalancedParathensis {
	
	public boolean isBalanced(String str) {
	    if (str.length() == 0) {
	        return false;
        }
        Stack<String> stackOfBrackets = new Stack<>();
        for (int i = 0; i < str.length(); i ++) {
            char toBeEval = str.charAt(i);
            if (toBeEval == '(' || toBeEval == '[' || toBeEval == '{') {
                stackOfBrackets.add(str);
            } else {
                if (stackOfBrackets.size() == 0) {
                    return false;
                }
                if (! str.equals(stackOfBrackets.peek())) {
                    return false;
                } else {
                    stackOfBrackets.pop();
                }
            }
        }
        return true;
	}
	
	public static void main (String[] args) {
		BalancedParathensis balancedParathensis = new BalancedParathensis();
        System.out.println(balancedParathensis.isBalanced("((([])))"));
	}
}
