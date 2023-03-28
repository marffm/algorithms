package org.learning.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    public void longest_consecutive_sequence_is_4() {
        int[] nums = new int[]{100,4,200,1,3,2};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(4, result);
    }

    @Test
    public void longest_consecutive_sequence_is_9() {
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(9, result);
    }

}