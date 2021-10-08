package org.example.greedy;

import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static javax.swing.SortOrder.ASCENDING;

public class Activity {
    static List<Interval> pairs = new ArrayList<>();

    static {
        pairs.add(new Interval(1,4));
        pairs.add(new Interval(3,7));
        pairs.add(new Interval(5,8));
        pairs.add(new Interval(7,10));
        pairs.add(new Interval(4,6));
        pairs.add(new Interval(13,15));
        Collections.sort(pairs, new SortByInt());

        for(Interval i : pairs) System.out.println(i);
    }

    public static void main(String[] args) {

    }
}

class SortByInt implements Comparator<Interval> {

    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.getEnd() - o2.getEnd();
    }
}

@Data
@AllArgsConstructor
class Interval {
    private Integer start;
    private Integer end;
}