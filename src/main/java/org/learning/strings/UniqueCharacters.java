package org.learning.strings;

public class UniqueCharacters {

    public Boolean hasNoDuplicates(String input) {
        boolean[] chars = new boolean[128];
        for(int letter: input.toCharArray()) {
            if (chars[letter]) return true;
            chars[letter] = true;
        }
        
        return false;
    }

}