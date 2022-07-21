package com.galvanize;

public class ToSentence {
    public static String toSentence(String[] input){
        StringBuilder result = new StringBuilder();
        // empty case
        if(input.length == 0 || input[0] == "") {
            return result.toString();
        }
        // normal case, only one valid string
        if(input.length == 1) {
            result.append(input[0]);
            return result.toString();
        }
        if(input.length == 2) {
            result = new StringBuilder(input[0] + " and " + input[1]);
            return result.toString();
        }
        // length > 3 - use string builder class
        for (int i = 0; i < input.length - 1; i++) {
            if(i == 0) {
                result.append(input[i]);
            } else {
                result.append(", ").append(input[i]);
            }
        }
        result.append(" and ").append(input[input.length - 1]);

        return result.toString();
    }
}
