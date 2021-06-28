package org.example.stack;

import java.util.Stack;

public class SpanningProblem {

    /*
    "[1,2,4], [3,4,2,9]
*/
    public void printSpanningEff(int[] arr) {
        Stack<Integer> s = new Stack();
        s.push(0);
        System.out.println(1);
        for (int i = 1; i < arr.length ; i ++) {
            int count = 1;

            if (arr[s.peek()] > arr[i])
                s.push(i);

            else if (arr[s.peek()] < arr[i]) {

                while (s.size() != 0 && arr[s.peek()] < arr[i]) {
                    s.pop();
                }
                int peekIndex = s.peek();
                s.push(i);

                if (s.size() == 1)
                    count = s.peek() + 1;
                else
                count = i - peekIndex;
            }

//            System.out.println(1);
            System.out.println(count);

        }

    }

    public void printSpanning(int[] arr) {

        for (int i = 0; i < arr.length ; i ++) { // i = 0, 1, 2
            int sum = 1;
            for (int j = i-1; j < i && j >= 0; j --) {  // j -1, 0, 1,0
                if (arr[j] < arr[i])        // a[i]: 2,4,1    a[j]:1,2, 1
                    sum = sum + 1;      // sum 2, 2,3
                else
                    break;

            }

            System.out.println(sum);        // sum: 1, 2 ,3
        }
    }

    public static void main(String[] args) {
        SpanningProblem spanningProblem = new SpanningProblem();
//        spanningProblem.printSpanningEff(new int[] {30,20,25,28,27,29});
        spanningProblem.printSpanning(new int[] {13,15,12,14,16,8,6,4,10,30});
    }
}
