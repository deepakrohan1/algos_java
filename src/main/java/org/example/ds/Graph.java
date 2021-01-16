package org.example.ds;

import java.util.*;
import java.util.stream.Collectors;

public class Graph {
    Map<String, List<String>> adjList ;
    Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(String key) {
//        if (! this.adjList.containsKey(key))
            this.adjList.put(key, new ArrayList<String>());
    }

    public void addEdge(String value1, String value2) {
        if ( this.adjList.containsKey(value1)) {
            this.adjList.get(value1).add(value2);
        }
        if ( this.adjList.containsKey(value2)) {
            this.adjList.get(value2).add(value1);
        }
    }

    public void removeEdge(String v1, String v2) {
        this.adjList
                .put(v1,
                        this.adjList.get(v1).stream()
                                .filter( v -> v != v2)
                                .collect(Collectors.toList()));
        this.adjList
                .put(v2,
                        this.adjList.get(v2).stream()
                                .filter( v -> v != v1)
                                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex("Tokyo");
        g.addVertex("SFO");
        g.addVertex("Delhi");
        g.addEdge("Tokyo", "Delhi");
        g.addEdge("Delhi", "SFO");
        System.out.println(g.adjList);
        g.removeEdge("Delhi", "SFO");
        System.out.println(g.adjList);

    }
}
