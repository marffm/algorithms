package org.learning.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramsMap = new HashMap<>();

        for (String element: strs) {
            int[] counts = new int[26];
            for(char c: element.toCharArray()) {
                var index = c - 'a';
                counts[c - 'a']++;
            }
            String key = Arrays.toString(counts);
            List<String> group = anagramsMap.getOrDefault(key, new ArrayList<>());
            group.add(element);
            anagramsMap.put(key, group);
        }

        return new ArrayList<>(anagramsMap.values());
    }

}
