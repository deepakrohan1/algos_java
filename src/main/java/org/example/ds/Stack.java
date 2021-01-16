package org.example.ds;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    public static void main(String[] args) {
        List<String> ab = new ArrayList<>();

        ab.add("s");
        ab.add("b");

        ab.remove(ab.get(0));

        System.out.println(ab);
    }
}
