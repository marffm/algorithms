package org.learning.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEncoderTest {

    private final StringEncoder stringEncoder = new StringEncoder();

    @Test
    public void expect_correct_count_as_output_from_input_string() {
        var input = "aaabbbcccddaa";
        var output = stringEncoder.encodeString(input);
        assertEquals("a3b3c3d2a2", output);
    }

    @Test
    public void expect_correct_count_as_output_from_input_string2() {
        var input = "aaabbbcc";
        var output = stringEncoder.encodeString(input);
        assertEquals("a3b3c2", output);
    }

    @Test
    public void expect_correct_count_as_output_from_input_string3() {
        var input = "aaa";
        var output = stringEncoder.encodeString(input);
        assertEquals("a3", output);
    }

}