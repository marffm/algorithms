package org.learning.arrays;

import java.util.HashSet;

public class ContainDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> register = new HashSet<>();

        for (int num : nums) {
            if (!register.add(num)) return true;
        }

        return false;
    }

}
