package org.learning.arrays;

import java.util.HashMap;

public class IsAnagramSolution {

    public boolean isAnagram(String first, String second) {
        if(first.length() != second.length()) return false;

        HashMap<Character, Integer> firstHashMap = new HashMap<>();
        HashMap<Character, Integer> secondHashMap = new HashMap<>();
        var length = first.length();
        for(int i = 0; i < length; i++) {
            firstHashMap.compute(first.charAt(i), (key, value) -> (value == null) ? 0 : value + 1);
            secondHashMap.compute(second.charAt(i), (key, value) -> (value == null) ? 0 : value + 1);
        }

        return firstHashMap.equals(secondHashMap);
    }

}
