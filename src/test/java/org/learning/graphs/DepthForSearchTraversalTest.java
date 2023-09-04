package org.learning.graphs;

import org.junit.jupiter.api.Test;
import org.learning.graphs.Graph.Node;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepthForSearchTraversalTest {

    @Test
    public void traverse_graph_using_depth_for_search() {
        Graph graph = createGraph();
        List<String> path = DepthForSearchTraversal.traverseGraph(graph, 1);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Ana");
        expectedList.add("Julia");
        expectedList.add("Marcela");
        expectedList.add("Felipe");
        expectedList.add("Frederico");
        expectedList.add("Felipe");
        expectedList.add("Frederico");
        assertEquals(expectedList, path);
    }

    private Graph createGraph() {
        Node node1 = new Node(1, "Ana");
        Node node2 = new Node(2, "Julia");
        Node node3 = new Node(3, "Marcela");
        Node node4 = new Node(4, "Felipe");
        Node node5 = new Node(5, "Frederico");
        Graph graph = new Graph(node1, node2, node3, node4, node5);

        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        return graph;
    }

}