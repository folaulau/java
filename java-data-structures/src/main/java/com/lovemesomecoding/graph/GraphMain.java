package com.lovemesomecoding.graph;

import java.util.Arrays;
import java.util.List;

public class GraphMain {

    /**
     * https://www.softwaretestinghelp.com/java-graph-tutorial/
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Edge> edges = Arrays.asList(new Edge(0, 1, 2), new Edge(0, 2, 4), new Edge(1, 2, 4), new Edge(2, 0, 5), new Edge(2, 1, 4), new Edge(3, 2, 3), new Edge(4, 5, 1), new Edge(5, 4, 3));

        Graph graph = new Graph(edges);

        graph.printGraph();

    }

}
