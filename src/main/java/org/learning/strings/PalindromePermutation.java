package org.learning.strings;

public class PalindromePermutation {

    public Boolean isPalindromePermutation(String text) {
        if (text.isEmpty() || text.length() == 1) return true;

        int initArrayCount = Character.getNumericValue('a');
        int endArrayCount = Character.getNumericValue('z');
        int[] charTable = new int[endArrayCount - initArrayCount + 1];
        for (int i = 0; i < text.length(); i++) {
            int charValue = Character.getNumericValue(text.charAt(i));
            if (initArrayCount <= charValue && charValue <= endArrayCount) {
                charTable[charValue - initArrayCount]++;
            }
        }

        boolean unique = false;
        for(int repeated: charTable){
            if (repeated == 1) {
                if (unique) return false;

                unique = true;
                continue;
            }

            if(repeated > 2) {
                int oddRepeated = repeated % 2;
                if (oddRepeated > 0) {
                    if (unique) return false;
                    unique = true;
                    continue;
                }
            }
        }


        return true;
    }


}
