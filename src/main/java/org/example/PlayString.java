package org.example;

public class    PlayString {

    public static String StringChallenge(String str) {
        // code goes here
        for (int i = 0; i < str.length(); i ++) {
            Integer s = Integer.parseInt(str.charAt(i) + "");
            int j = 0;
            for ( j =  i; j < i + s  && j < str.length(); j ++) {
                    if (str.charAt(i) != str.charAt(j) ) {
                    break;
                }
            }
                if ( (j - i ) == s)
                return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        System.out.println(PlayString.StringChallenge("2334445"));
    }
}
