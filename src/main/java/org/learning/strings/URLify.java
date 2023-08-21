package org.learning.strings;

public class URLify {

    public void replaceSpaces(char[] charArray, int trueLength) {
        int newIndex = charArray.length -1;
        for (int oldIndex = trueLength -1; oldIndex >= 0; oldIndex--) {
            if (charArray[oldIndex] == ' ') {
                charArray[newIndex] = '0';
                charArray[newIndex -1] = '2';
                charArray[newIndex -2] = '%';
                newIndex -= 3;
                continue;
            }

            charArray[newIndex] = charArray[oldIndex];
            newIndex--;
        }
    }
}
