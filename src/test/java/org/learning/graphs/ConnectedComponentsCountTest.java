package org.learning.graphs;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConnectedComponentsCountTest {

    @Test
    public void connected_components_2() {
        Map<Integer, List<Integer>> graph = Map.of(
                0, List.of(8, 1, 5),
                1, List.of(0),
                5, List.of(0, 8),
                8, List.of(0, 5),
                2, List.of(3, 4),
                3, List.of(2, 4),
                4, List.of(3, 2));

        int result = ConnectedComponentsCount.countComponents(graph);
        assertEquals(2, result);
    }

    @Test
    public void connected_components_1() {
        Map<Integer, List<Integer>> graph = Map.of(
                1, List.of(2),
                2, List.of(1,8),
                6, List.of(7),
                9, List.of(8),
                7, List.of(6, 8),
                8, List.of(9, 7, 2)
        );

        int result = ConnectedComponentsCount.countComponents(graph);
        assertEquals(1, result);
    }


    @Test
    public void connected_components_0() {
        Map<Integer, List<Integer>> graph = Map.of();

        int result = ConnectedComponentsCount.countComponents(graph);
        assertEquals(0, result);
    }


    @Test
    public void connected_components_5() {
        Map<Integer, List<Integer>> graph = Map.of(
                0, List.of(4,7),
                1, List.of(),
                2, List.of(),
                3, List.of(6),
                4, List.of(0),
                6, List.of(3),
                7, List.of(0),
                8, List.of()
        );

        int result = ConnectedComponentsCount.countComponents(graph);
        assertEquals(5, result);
    }

    @Test
    public void test() {
        int n = 5;
        String x = Integer.toBinaryString(n);
        String result = x;
        for (int i = 0; i < (32 - x.length()); i++) {
            result = result + "0";
        }
        var marce = Integer.parseInt(result, 2);
        System.out.println(marce);
    }

}