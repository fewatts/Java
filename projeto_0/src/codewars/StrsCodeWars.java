package codewars;

import java.util.*;
import java.util.stream.Collectors;

/**
 * A utility class containing various string manipulation methods.
 */
public class StrsCodeWars {

    /**
     * Converts DNA to RNA by replacing each 'T' with 'U'.
     *
     * @param dna The input DNA string.
     * @return The RNA string obtained by replacing 'T' with 'U'.
     */
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }

    /**
     * Removes all exclamation marks from the input string.
     *
     * @param s The input string.
     * @return The string with all exclamation marks removed.
     */
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

    /**
     * Generates a greeting based on the provided name and owner.
     *
     * @param name  The name of the person.
     * @param owner The owner's name.
     * @return A greeting based on whether the name matches the owner or not.
     */
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

    /**
     * Checks if the input string is an isogram, which means it has no repeating
     * characters.
     *
     * @param str The input string.
     * @return true if the string is an isogram, false otherwise.
     */
    public static boolean isIsogram(String str) {
        String lower = str.toLowerCase();

        Set<Character> chr = new HashSet<>();
        for (var c : lower.toCharArray()) {
            if (chr.contains(c))
                return false;

            chr.add(c);
        }
        return true;
    }

    /**
     * Finds the longest distinct sorted string from two input strings.
     *
     * @param s1 The first input string.
     * @param s2 The second input string.
     * @return The longest distinct sorted string formed by combining the two input
     *         strings.
     */
    public static String longest(String s1, String s2) {
        String concatStr = s1 + s2;
        char[] longestArray = concatStr.toCharArray();
        Arrays.sort(longestArray);

        StringBuilder distinctString = new StringBuilder();
        char previousChar = '\0';

        for (var c : longestArray) {
            if (c != previousChar) {
                distinctString.append(c);
                previousChar = c;
            }
        }
        return distinctString.toString();
    }

    /**
     * Validates a PIN number by checking if it consists of either 4 or 6 digits.
     *
     * @param pin The input PIN number as a string.
     * @return true if the PIN is valid (4 or 6 digits), false otherwise.
     */
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}") && pin.matches("\\d+");
    }

    /**
     * Reverses the order of characters in the input string.
     *
     * @param original The original input string.
     * @return The reversed string.
     */
    public static String reverseWords(final String original) {
        char[] charArray = original.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    /**
     * Checks if a given string ends with a specified ending string.
     *
     * @param str    The input string.
     * @param ending The ending string to check for.
     * @return true if the input string ends with the specified ending, false
     *         otherwise.
     */
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    /**
     * Filters a list to contain only the Integer elements and returns the filtered
     * list.
     *
     * @param list The input list containing elements of various types.
     * @return A new list containing only the Integer elements from the input list.
     */
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(element -> element instanceof Integer)
                .collect(Collectors.toList());
    }

    /**
     * Converts a numeric string to an integer.
     *
     * @param str The input string representing a number.
     * @return The integer value of the input string.
     */
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
    
}
