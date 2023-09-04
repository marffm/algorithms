package org.learning.graphs;

import org.learning.graphs.Graph.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.util.Collections.emptyList;

public class DepthForSearchTraversal {

    public static List<String> traverseGraph(Graph graph, int startNodeId) {
        Node startNode = graph.getNode(startNodeId);
        if (startNode == null) {
            return emptyList();
        }

        List<String> nodesTraversed = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        stack.push(startNode);
        while (!stack.empty()) {
            Node node = stack.pop();
            nodesTraversed.add(node.getName());
            stack.addAll(node.getAdjacent());
        }

        return nodesTraversed;
    }
}
