package org.example.graph;

import java.util.ArrayList;

public class LearningEdge {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adjArr = new ArrayList<>(V);
        for (int i = 0; i < 5; i ++) {
            adjArr.add(new ArrayList<>());
        }

        addEdge(adjArr, 0, 1);
        addEdge(adjArr, 0, 2);
        addEdge(adjArr, 1, 2);
        addEdge(adjArr, 1, 3);
        printGraph(adjArr);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i ++) {
            for (int j = 0; j < arr.get(i).size(); j ++) {
                System.out.println(arr.get(i).get(j) + "");
            }
            System.out.println();
        }
    }
}
