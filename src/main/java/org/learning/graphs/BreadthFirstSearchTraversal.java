package org.learning.graphs;

import org.learning.graphs.Graph.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearchTraversal {

    public List<String> traverseGraph(Graph graph, int startNode) {
        var queue = new ArrayDeque<Node>();
        var names = new ArrayList<String>();

        queue.add(graph.getNode(startNode));
        while (!queue.isEmpty()) {
            var current = queue.pop();
            names.add(current.getName());
            queue.addAll(current.getAdjacent());
        }

        return names;
    }
}
