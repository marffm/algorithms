package org.learning.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void test_example_one() {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = this.groupAnagrams.groupAnagrams(str);

        List<List<String>> expectedResult = List.of(
          List.of("bat"),
          List.of("nat", "tan") ,
          List.of("ate", "eat", "tea")
        );


    }

}