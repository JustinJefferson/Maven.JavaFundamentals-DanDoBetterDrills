package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        return (firstSegment + secondSegment);
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){

        return (firstSegment + secondSegment);
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){

        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){

        int length = input.length();

        return input.substring(length - 3, length);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){


        Integer middle  =  -1;

        if(inputValue.length() % 2 == 0) {
            middle = inputValue.length() / 2 - 1;
        }
        else {
            middle = inputValue.length() / 2;
        }

        return inputValue.charAt(middle);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){

        // Find space
        Integer spaceIndex = 0;
        for(int i = 0; i < spaceDelimitedString.length(); i++) {

            if(spaceDelimitedString.charAt(i) == ' ') {

                spaceIndex = i;
                break;

            }

        }

        return spaceDelimitedString.substring(0, spaceIndex);
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        Integer spaceCounter = 0;
        Integer start = 0;
        Integer end = spaceDelimitedString.length();

        for(int i = 0; i < spaceDelimitedString.length(); i++){

            if(spaceDelimitedString.charAt(i) == ' ') {

                if(spaceCounter == 0) {

                    start = i + 1;
                    spaceCounter++;

                }
                else if(spaceCounter == 1) {

                    end = i;
                    break;

                }
            }
        }


        System.out.println("Start: " + start + "End: " + end);

        return spaceDelimitedString.substring(start, end);
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        StringBuilder reverse = new StringBuilder(stringToReverse);
        reverse.reverse();

        return reverse.toString();
    }
}
