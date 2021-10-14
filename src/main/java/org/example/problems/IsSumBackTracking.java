package org.example.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IsSumBackTracking {

    public static boolean canSum(ArrayList<Integer> choices, Integer target ) {
        if (target == 0) return true;
        else if (choices.isEmpty() || target < 0) return false;

        int val = choices.get(0);
        choices.remove(0);

        if (canSum( choices, target) || canSum( choices, target -val)) {
            return true;
        }

        choices.add(0, val);

        return false;

    }

    // TODO Not an way it gets all the combinations of characters in ch Array
    public static void printAllPermutations(String res, Character[] choices) {

        // Get the String with uniq character to get the permutations
        if (res.length() == choices.length) System.out.println(res);
        else {
            for (int i = 0; i < choices.length; i++) {
                res += choices[i];
                printAllPermutations(res, choices);
                res = res.substring(0, res.length() - 1);
            }
        }
    }

    public static void findAllSubsets(ArrayList<Integer> choices,
                                      Integer length,
                                      ArrayList<Integer> selections) {

        if (length ==0 ) System.out.println(Arrays.toString(selections.stream().toArray()));

        else {
            int val = choices.get(0);
            choices.remove(0);

            findAllSubsets(choices, length - 1, selections);
            selections.add(val);
            findAllSubsets(choices, length - 1, selections);

            choices.add(0, val);
//            Iterator<Integer> selections = selections.iterator()
            Iterator<Integer> select = selections.listIterator();
           while (select.hasNext()) {
               if (select.next() == val) {
                   select.remove();
               }
           }
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> choices = new ArrayList<Integer>();
        choices.add(1);
        choices.add(2);
        choices.add(3);
//        choices.add(6);

//        findAllSubsets(choices, choices.size(), new ArrayList<Integer>());

//        System.out.println(canSum(
//                choices, 3
//        ));

        printAllPermutations("", new Character[] {'a', 'b', 'c'});

    }
}
