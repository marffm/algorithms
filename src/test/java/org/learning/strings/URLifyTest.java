package org.learning.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class URLifyTest {

    private final URLify urLify = new URLify();

    @Test
    public void test_spaces_must_be_replaced_correctly() {
        char[] input = "This is an example.      ".toCharArray();
        int trueLength = 19;
        this.urLify.replaceSpaces(input, trueLength);
        assertArrayEquals("This%20is%20an%20example.".toCharArray(), input);
    }

    @Test
    public void test_spaces_must_be_replaced_correctly_starting_with_space() {
        char[] input = " This is an example.        ".toCharArray();
        int trueLength = 20;
        this.urLify.replaceSpaces(input, trueLength);
        assertArrayEquals("%20This%20is%20an%20example.".toCharArray(), input);
    }
}