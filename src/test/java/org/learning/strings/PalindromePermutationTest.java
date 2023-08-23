package org.learning.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromePermutationTest {

    @Test
    public void testEmptyString() {
        PalindromePermutation pp = new PalindromePermutation();
        assertTrue(pp.isPalindromePermutation(""));
    }

    @Test
    public void testSingleCharacter() {
        PalindromePermutation pp = new PalindromePermutation();
        assertTrue(pp.isPalindromePermutation("a"));
    }

    @Test
    public void testPalindrome() {
        PalindromePermutation pp = new PalindromePermutation();
        assertTrue(pp.isPalindromePermutation("racecar"));
    }

    @Test
    public void testPalindromePermutation() {
        PalindromePermutation pp = new PalindromePermutation();
        assertTrue(pp.isPalindromePermutation("aabb"));
        assertTrue(pp.isPalindromePermutation("abba"));
        assertTrue(pp.isPalindromePermutation("abcba"));
    }

    @Test
    public void testNonPalindromePermutation() {
        PalindromePermutation pp = new PalindromePermutation();
        assertFalse(pp.isPalindromePermutation("abc"));
        assertFalse(pp.isPalindromePermutation("aabc"));
    }

    @Test
    public void testStringWithSpaces() {
        PalindromePermutation pp = new PalindromePermutation();
        assertTrue(pp.isPalindromePermutation("taco cat"));
    }
}