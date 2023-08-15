package org.learning.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersTest {

    private final UniqueCharacters uniqueCharacters = new UniqueCharacters();
    @Test
    void hasNoDuplicates() {
        String input = "Marcelo";
        Boolean result = this.uniqueCharacters.hasNoDuplicates(input);
        assertEquals(false, result);
    }

    @Test
    void hasDuplicates() {
        String input = "Fabiana";
        Boolean result = this.uniqueCharacters.hasNoDuplicates(input);
        assertEquals(true, result);
    }
}