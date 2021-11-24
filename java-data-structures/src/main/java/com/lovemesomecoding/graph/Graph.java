package com.lovemesomecoding.graph;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
// @AllArgsConstructor
@NoArgsConstructor
@ToString
public class Graph implements Serializable {

    /**
     * 
     */
    private static final long     serialVersionUID = 1L;

    private List<List<GraphNode>> adjList          = new ArrayList<>();

    public Graph(List<Edge> edges) {
        for (int i = 0; i < edges.size(); i++) {
            adjList.add(i, new ArrayList<>());
        }

        for (Edge edge : edges) {
            adjList.get(edge.getSrc()).add(new GraphNode(edge.getDest(), edge.getWeight()));
        }
    }

    public void printGraph() {
        int src_vertex = 0;
        int list_size = adjList.size();

        System.out.println("The contents of the graph:");
        while (src_vertex < list_size) {
            // traverse through the adjacency list and print the edges

            for (GraphNode edge : adjList.get(src_vertex)) {
                System.out.print("Vertex:" + src_vertex + " ==> " + edge.getValue() + " (" + edge.getWeight() + ")\t");
            }

            System.out.println();
            src_vertex++;
        }
    }

}
