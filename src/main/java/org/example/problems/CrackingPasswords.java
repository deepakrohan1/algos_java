package org.example.problems;


public class CrackingPasswords {

    public static String createPasswords(String password, int length) {


        String log = String.format ("Password %s and length is %d", password, length);
        System.out.println(length +"::" +log);

        if(isValid(password)) {
            System.out.println("=======" + password);
            return password;

        }

        if (length == 0) return "";

        for(char i = 'a'; i <= 'z'; i++) {
            String temp = password;
            password += i;
            String s = createPasswords(password, length -1);
            if (! s.isEmpty()) return s;
            password = temp;
        }

        return "";


    }

    static boolean isValid(String s ) {
        if (s.equals("dg")) return true;

        return false;
    }

    public static void main(String[] args) {
        Character[] ch = new Character[] {'a','b','c','d','h','f', 'e', 'l',  'o'};
        createPasswords("", 2);
    }
}
