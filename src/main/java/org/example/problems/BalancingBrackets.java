package org.example.problems;

import java.util.Stack;

public class BalancingBrackets {

    public boolean checkForBalancingBrackets(String brackets) {
        Stack<String> stacks = new Stack();
       for (String s : brackets.split("")) {
            System.out.println(s);
            if (s.equals("{")) {
                stacks.add(s);
            }

           else if ( s.equals("}")) {
                if (stacks.size() > 0) {
                    String p = stacks.pop();
                    if ( ! p.equals("{")) {
                        return false;
                    }

                } else {
                    return false;
                }

            }
       }

       return true;
    }

    public static void main(String[] args) {
        BalancingBrackets bb = new BalancingBrackets();
        System.out.println(bb.checkForBalancingBrackets("{{}}{}{{}}r"));
    }
}
