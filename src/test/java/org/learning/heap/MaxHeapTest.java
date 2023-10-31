package org.learning.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxHeapTest {

    private final MaxHeap maxHeap = new MaxHeap(7);



    @Test
    public void test_full_minHeap_dataSet_after_insertion() {
        int[] input = {10, 8, 15, 23, 45, 32, 27};

        for (int num: input) {
            maxHeap.insert(num);
        }

        int[] result = new int[7];
        for (int i = 0 ; i < 7; i++) {
            result[i] = maxHeap.pop();
        }

        int[] expected = {45, 32, 27, 23, 15, 10, 8};
        assertArrayEquals(expected, result);
    }


}