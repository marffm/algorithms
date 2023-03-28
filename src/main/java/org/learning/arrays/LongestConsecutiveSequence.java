package org.learning.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    // suggested approach
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int hits = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) set.add(num);

        for (int num: nums) {
            if (set.contains(num -1)) continue;
            int seq = 1;
            while (set.contains(num +1)) {
                seq++;
                num++;
            }

            hits = Math.max(seq, hits);
        }

        return hits;

    }

//    faster approach
//    public int longestConsecutive(int[] nums) {
//        if (nums.length == 0) return 0;
//
//        int hits = 0;
//
//        HashSet<Integer> set = new HashSet<>();
//        for (int num: nums) set.add(num);
//
//        for (int num: nums) {
//            if (set.contains(num -1)) continue;
//            int seq = 1;
//            while (set.contains(num +1)) {
//                seq++;
//                num++;
//            }
//
//            hits = Math.max(seq, hits);
//        }
//
//        return hits;
//    }

}
