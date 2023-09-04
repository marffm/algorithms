package org.learning.graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

    private final HashMap<Integer, Node> nodes = new HashMap<>();

    public static class Node {
        private final Integer id;
        private final String name;
        private final LinkedList<Node> adjacent = new LinkedList<>();

        public Node(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public LinkedList<Node> getAdjacent() {
            return this.adjacent;
        }

        public String getName() {
            return this.name;
        }
    }

    public Graph(Node ... nodes) {
        for (Node node: nodes) {
            this.nodes.put(node.id, node);
        }
    }

    public Node getNode(int elementId) {
        return nodes.get(elementId);
    }

    public void addEdge(int elementId, int destinationId) {
        Node rootNode = nodes.get(elementId);
        Node destinationNode = nodes.get(destinationId);
        if (rootNode != null && destinationNode != null) {
            rootNode.adjacent.add(destinationNode);
        }
    }

}
