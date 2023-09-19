package org.learning.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ConnectedComponentsCount {

    public static int countComponents(Map<Integer, List<Integer>> graph) {
        int connections = 0;
        HashSet<Integer> visited = new HashSet<>();

        for(int edge: graph.keySet()) {
            if(traverse(edge, visited, graph))
                connections++;
        }

        return connections;
    }

    private static boolean traverse(int edge, HashSet<Integer> visited, Map<Integer, List<Integer>> graph) {
        if(visited.contains(edge)) return false;
        visited.add(edge);
        for(int current: graph.get(edge)) {
            traverse(current, visited, graph);
        }

        return true;
    }

}
