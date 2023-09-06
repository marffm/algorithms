package org.learning.graphs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstSearchTraversalTest {

    private final BreadthFirstSearchTraversal breadthFirstSearchTraversal = new BreadthFirstSearchTraversal();

    @Test
    public void traverse_graph_using_breadth_for_search() {
        var graph = createGraph();
        var result = breadthFirstSearchTraversal.traverseGraph(graph, 1);

        var expectedList = List.of(
                "Ana",
                "Felipe",
                "Julia",
                "Frederico",
                "Marcela",
                "Felipe",
                "Frederico"
        );

        assertEquals(expectedList, result);

    }


    private Graph createGraph() {
        Graph.Node node1 = new Graph.Node(1, "Ana");
        Graph.Node node2 = new Graph.Node(2, "Julia");
        Graph.Node node3 = new Graph.Node(3, "Marcela");
        Graph.Node node4 = new Graph.Node(4, "Felipe");
        Graph.Node node5 = new Graph.Node(5, "Frederico");
        Graph graph = new Graph(node1, node2, node3, node4, node5);

        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        return graph;
    }

}