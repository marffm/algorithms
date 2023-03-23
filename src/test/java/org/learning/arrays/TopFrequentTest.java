package org.learning.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopFrequentTest {

    private TopFrequent topFrequent = new TopFrequent();

    @Test
    public void test_top_2_frequent() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;

        int[] result = topFrequent.topKFrequent(nums, k);


        var expected = new int[]{1, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_top_1_frequent() {
        int[] nums = new int[]{1};
        int k = 1;

        int[] result = topFrequent.topKFrequent(nums, k);

        assertTrue(List.of(nums).containsAll(List.of(result)));
    }

}