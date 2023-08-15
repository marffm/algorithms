package org.learning.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationTest {

    private final Permutation permutation = new Permutation();

    @Test
    public void is_permutation() {
        String input1 = "abc";
        String input2 = "bca";
        Boolean result = permutation.isPermutation(input1, input2);
        assertTrue(result);
    }

    @Test
    public void is_not_permutation() {
        String input1 = "abc";
        String input2 = "def";
        Boolean result = permutation.isPermutation(input1, input2);
        assertFalse(result);
    }

    @Test
    public void is_permutation_no_case_sensitive() {
        String input1 = "Abc";
        String input2 = "bCa";
        Boolean result = permutation.isPermutation(input1, input2);
        assertTrue(result);
    }

    @Test
    public void is_not_permutation_different_size() {
        String input1 = "Abc";
        String input2 = "bCad";
        Boolean result = permutation.isPermutation(input1, input2);
        assertFalse(result);
    }

    @Test
    public void is_permutation_with_numeric_characters() {
        String input1 = "Abc3";
        String input2 = "3bCa";
        Boolean result = permutation.isPermutation(input1, input2);
        assertTrue(result);
    }

    @Test
    public void is_permutation_with_repeated_characters() {
        String input1 = "Fabiana";
        String input2 = "AnaFabi";
        Boolean result = permutation.isPermutation(input1, input2);
        assertTrue(result);
    }
}