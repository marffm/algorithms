package org.learning.interview;

public class StringEncoder {

    /**
     * Given a String like aaabbbccddaa, the function should count the letters
     * and return a string with the counted letters. i.e. a3b3c2a2
     * @param input String
     * @return String
     */
    public String encodeString(String input) {
        var output =  new StringBuilder();
        int counter = 1;
        char temp = ' ';
        for (int i = 1; i < input.length(); i++) {
            temp = input.charAt(i-1);
            if(input.charAt(i) != temp) {
                output.append(input.charAt(i-1));
                output.append(counter);
                counter = 1;
                continue;
            }
            counter++;
        }

        output.append(temp);
        output.append(counter);

        return output.toString();
    }

}
