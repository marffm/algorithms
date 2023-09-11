package org.learning.graphs;


import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.Set;
import java.util.HashMap;

public class UndirectedPath {

    public boolean hasPath(List<List<String>> edges, String nodeA, String nodeB) {
        if (nodeA.equals(nodeB)) return true;

        var graph = createGraph(edges);

        var stack = new Stack<String>();
        var initial = graph.getOrDefault(nodeA, Collections.emptySet());
        stack.addAll(initial);

        var visited = new HashSet<String>();
        visited.add(nodeA);

        while (!stack.empty()) {
            var element = stack.pop();
            if (visited.contains(element)) continue;

            if(nodeB.equals(element)) return true;

            visited.add(element);
            stack.addAll(graph.getOrDefault(element, Collections.emptySet()));
        }

        return false;
    }

    private HashMap<String, Set<String>> createGraph(List<List<String>> edges) {
        var graph = new HashMap<String, Set<String>>();

        for (var edge: edges) {
            var firstElement = edge.get(0);
            var secondElement = edge.get(1);
            graph.computeIfAbsent(firstElement, key -> new HashSet<>()).add(secondElement);
            graph.computeIfAbsent(secondElement, key -> new HashSet<>()).add(firstElement);
        }

        return graph;
    }
}
