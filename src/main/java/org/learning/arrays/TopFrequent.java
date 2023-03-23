package org.learning.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) return nums;

        Map<Integer, Integer> frequencyCounter = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1]; // Array of Lists
        for (int num: nums) {
            frequencyCounter.merge(num, 1, Integer::sum); // Create a HashMap with the numbers and frequency
        }

        // Iterate over the map and create an array where the keys are the frequency
        for (Map.Entry<Integer, Integer> entry : frequencyCounter.entrySet()) {
            if (bucket[entry.getValue()] == null) {
                bucket[entry.getValue()] = new ArrayList<>();
            }
            bucket[entry.getValue()].add(entry.getKey()); // push the num to the list under the frequency index
        }

        int index = 0; // Index of the response Array
        int[] arr = new int[k];

        // Iterate on the nums length because it contains all the number that has in the calculation
        for (int i = nums.length; i >= 0; i--) {
            // Check if there's a number of repetitions stored,
            // if yes iterate in the list and stored it in the response array
            if (bucket[i] != null) {
                for(int val: bucket[i]) {
                    arr[index++] = val;
                    if (index == k) return arr;
                }
            }
        }


        return arr;
    }

}
