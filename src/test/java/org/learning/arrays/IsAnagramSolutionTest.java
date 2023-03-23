package org.learning.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsAnagramSolutionTest {

    private IsAnagramSolution isAnagramSolution = new IsAnagramSolution();

    @Test
    public void test_IsAnagram_call_true() {
        String string1 = "anagram";
        String string2 = "nagaram";
        Boolean result1 = isAnagramSolution.isAnagram(string1, string2);
        assertTrue(result1);
    }

    @Test
    public void test_IsAnagram_call_false() {
        String string1 = "rat";
        String string2 = "car";
        Boolean result1 = isAnagramSolution.isAnagram(string1, string2);
        assertFalse(result1);
    }

}