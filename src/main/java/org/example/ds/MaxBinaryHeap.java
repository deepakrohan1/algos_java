package org.example.ds;

import java.util.ArrayList;
import java.util.List;

public class MaxBinaryHeap {
    List<Integer> heap = new ArrayList<>();

    MaxBinaryHeap () {
        this.heap.add(41);
        this.heap.add(39);
        this.heap.add(33);
        this.heap.add(18);
        this.heap.add(27);
        this.heap.add(12);
    }

    public void insertData(int data) {
        heap.add(data);
        int length = heap.size() - 1;

        while (length > 0) {
            int parent = (int) Math.floor( ( length - 1) / 2);
            int parentEle = heap.get(parent);
            if (data <= parentEle) break;
            else {
                this.heap.set(parent, data);
                this.heap.set(length, parentEle);
                length = parent;
            }


        }
    }

    public static void main(String[] args) {
        MaxBinaryHeap m = new MaxBinaryHeap();
        System.out.println(m.heap);
        m.insertData(55);
        System.out.println(m.heap);
        m.insertData(40);
        System.out.println(m.heap);
    }

}
