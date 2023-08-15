package org.learning.strings;

public class Permutation {

    public Boolean isPermutation(String input1, String input2) {
        if (input1.length() != input2.length()) return false;
        int[] charSet = new int[128];

        for (char letter: input1.toCharArray()) {
            int index = Character.toLowerCase(letter);
            charSet[index]++;
        }

        for (int letter: input2.toLowerCase().toCharArray()) {
            int index = Character.toLowerCase(letter);
            charSet[index]--;
            if (charSet[index] < 0) return false;
        }

        return true;
    }

}
