package org.example.arr;

public class Replace0And5 {


    int convert0ToFives(int num) {
        String number = num +"";
        StringBuilder sb = new StringBuilder();
        String[] characterArr = number.split("");

        for(int i = 0; i < number.length(); i++) {
            Character ch = number.charAt(i);

            if (ch == '0')
                sb.append(5);
            else
                sb.append(ch);
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Replace0And5 r = new Replace0And5();
        System.out.println(r.convert0ToFives(1004));
        System.out.println(r.convert0ToFives(121));
        System.out.println(r.convert0ToFives(0003));
    }
}
