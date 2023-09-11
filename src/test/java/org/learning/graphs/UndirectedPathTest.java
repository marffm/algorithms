package org.learning.graphs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UndirectedPathTest {

    private final UndirectedPath undirectedPath = new UndirectedPath();

    private final List<List<String>> edges =  List.of(
            List.of("i", "j"),
            List.of("k", "i"),
            List.of("m", "k"),
            List.of("k", "l"),
            List.of("o", "n")
    );

    private final List<List<String>> edges2 = List.of(
            List.of("b", "a"),
            List.of("c", "a"),
            List.of("b", "c"),
            List.of("q", "r"),
            List.of("q", "s"),
            List.of("q", "u"),
            List.of("q", "t")
    );

    @Test
    public void test_00_return_true() {
        assertTrue(undirectedPath.hasPath(edges, "j", "m"));
    }

    @Test
    public void test_01_return_true() {
        assertTrue(undirectedPath.hasPath(edges, "m", "j"));
    }

    @Test
    public void test_02_return_true() {
        assertTrue(undirectedPath.hasPath(edges, "l", "j"));
    }

    @Test
    public void test_03_return_false() {
        assertFalse(undirectedPath.hasPath(edges, "k", "o"));
    }

    @Test
    public void test_04_return_false() {
        assertFalse(undirectedPath.hasPath(edges, "i", "o"));
    }

    @Test
    public void test_05_return_true() {
        assertTrue(undirectedPath.hasPath(edges2, "a", "b"));
    }

    @Test
    public void test_06_return_true() {
        assertTrue(undirectedPath.hasPath(edges2, "a", "c"));
    }

    @Test
    public void test_07_return_true() {
        assertTrue(undirectedPath.hasPath(edges2, "r", "t"));
    }

    @Test
    public void test_08_return_false() {
        assertFalse(undirectedPath.hasPath(edges2, "r", "b"));
    }

}