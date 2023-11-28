package lib;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

    /**
     * Converts an integer to its string representation.
     *
     * @param num The input integer to be converted to a string.
     * @return The string representation of the input integer.
     */
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    /**
     * Converts a boolean value to its string representation.
     *
     * @param b The boolean value to be converted.
     * @return The string representation of the boolean value ("true" or "false").
     */
    public static String convert(boolean b) {
        return Boolean.toString(b);
    }

    /**
     * Determines whether a person's name indicates if they are playing the banjo or
     * not.
     * If the first character of the name is 'R' or 'r', it suggests the person
     * plays the banjo.
     * Otherwise, it indicates that the person does not play the banjo.
     *
     * @param name The name of the person to check.
     * @return A message indicating whether the person plays the banjo or not.
     */
    public static String areYouPlayingBanjo(String name) {
        char firstChar = name.charAt(0);

        return (firstChar == 'r' || firstChar == 'R') ? name + " plays banjo" : name + " does not play banjo";
    }

    /**
     * Counts the number of unique duplicate characters in the input string,
     * is case sensitivity.
     *
     * The method takes a string as input and iterates through each character to
     * count the unique duplicates.
     * It considers the characters as duplicates regardless of case, i.e., 'a' and
     * 'A' will be counted as duplicates.
     *
     * @param text The input string in which to count the unique duplicate
     *             characters.
     * @return The number of unique duplicate characters in the input string,
     *         with case sensitivity.
     */
    public static int duplicateCount(String text) {
        char[] charArray = text.toCharArray();
        Set<Character> duplicates = new HashSet<>();
        Set<Character> markedCharacters = new HashSet<>();

        for (char currentChar : charArray) {
            char lowerCaseChar = Character.toLowerCase(currentChar);

            if (markedCharacters.contains(lowerCaseChar)) {
                duplicates.add(lowerCaseChar);
            } else {
                markedCharacters.add(lowerCaseChar);
            }

        }
        return duplicates.size();
    }

    /**
     * Counts the number of vowels (i.e., lowercase 'a', 'e', 'i', 'o', 'u') in the
     * given string.
     * This method uses regular expression matching to find all occurrences of
     * vowels in the input string.
     *
     * @param str The input string in which vowels need to be counted.
     * @return The number of vowels (i.e., lowercase 'a', 'e', 'i', 'o', 'u') found
     *         in the input string.
     * @throws NullPointerException If the input string 'str' is null.
     *
     * @implNote This method uses a regular expression pattern to match each vowel
     *           in the input string.
     *           The pattern "[aeiou]" is used to find any character in the string
     *           that is a vowel (i.e., 'a', 'e', 'i', 'o', 'u').
     *           The Matcher class is then used to find all occurrences of the
     *           pattern in the string.
     *           The count of occurrences is incremented for each match found, and
     *           the final count is returned as the result.
     *
     * @implSpec This method assumes that the input string contains only lowercase
     *           characters.
     *           Any uppercase vowels or non-alphabetic characters will not be
     *           considered as vowels in the count.
     *           For example, 'A' or 'E' will not be counted as vowels, and
     *           punctuation marks will be ignored.
     *
     * @example
     *          {@code
     * String input = "Hello, how are you today?";
     * int result = getCount(input);
     * // The result will be 7, as there are 7 vowels ('e', 'o', 'o', 'a', 'e', 'o', 'a') in the input string.
     * }
     *
     * @see Matcher
     * @see Pattern
     */
    public static int getCount(String str) {
        Matcher matcher = Pattern.compile("[aeiou]").matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    /**
     * Removes all occurrences of space characters (' ') from the input string.
     *
     * @param x The input string from which spaces will be removed.
     * @return A new string with all spaces removed from the input string.
     * @throws NullPointerException If the input string 'x' is null.
     */
    public static String noSpace(final String x) {
        StringBuilder r = new StringBuilder();

        for (char s : x.toCharArray()) {
            if (s != ' ') {
                r.append(s);
            }

        }
        return r.toString();
    }

    /**
     * Generates a string that counts the number of sheep up to the given input
     * number.
     *
     * The generated string will consist of individual counts of sheep separated by
     * ellipsis ("...").
     * The counts start from 1 and go up to the given input number.
     *
     * @param num The number of sheep to count up to.
     * @return A string containing the counts of sheep up to the given number,
     *         separated by ellipsis ("...").
     * @throws IllegalArgumentException If the input number 'num' is less than or
     *                                  equal to zero.
     */
    public static String countingSheep(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input number 'num' must be greater than zero.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            String sheepCount = i + " Sheep...";
            result.append(sheepCount);
        }

        return result.toString();
    }

    /**
     * Given a string of digits, replaces any digit below '5' with '0' and any digit
     * '5' and above with '1'.
     *
     * @param numberString The input string containing a sequence of digits. It will
     *                     not be empty.
     * @return The resulting string where each digit below '5' is replaced with '0',
     *         and each digit '5' and above is replaced with '1'.
     */
    public static String fakeBin(String numberString) {
        return numberString.chars()
                .mapToObj(c -> (c < '5') ? '0' : '1')
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    /**
     * Calculates the binary representation of the sum of two integers.
     *
     * The method takes two integers 'a' and 'b', adds them together, and then
     * converts the sum to its binary representation.
     *
     * @param a The first integer to be added.
     * @param b The second integer to be added.
     * @return The binary representation of the sum of 'a' and 'b'.
     */
    public static String binaryAddition(int a, int b) {
        return Integer.toBinaryString(a + b);
    }

    /**
     * Counts the occurrences of each character in a given string.
     *
     * This method iterates through the provided string and counts the occurrences
     * of each character
     * present in the string. It stores the results in a map, where each character
     * is associated with
     * its number of occurrences in the string.
     *
     * @param str The input string to be analyzed.
     * @return A map containing the characters in the string as keys and their
     *         respective counts as values.
     */
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }
        return occurrences;
    }

    /**
     * Finds the highest scoring word in a string of words.
     *
     * Each letter of a word scores points according to its position in the
     * alphabet: a = 1, b = 2, c = 3, and so on.
     * The method splits the input string into individual words, calculates the
     * score for each word based on the position
     * of each character in the alphabet, and returns the word with the highest
     * score. If multiple words have the same
     * highest score, the method returns the word that appears earliest in the
     * original string.
     *
     * @param s The input string containing words separated by spaces.
     * @return The word with the highest score in the string. If the input string is
     *         empty, an empty string is returned.
     */
    public static String high(String s) {
        String[] wordArray = s.split(" ");
        int maxScore = 0;
        String highestScoringWord = "";

        for (String word : wordArray) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += (c - 'a' + 1);
            }

            if (score > maxScore) {
                maxScore = score;
                highestScoringWord = word;
            }

        }
        return highestScoringWord;
    }

    /**
     * Converts a given string to uppercase.
     * 
     * This method takes a string as input and returns a new string where all the
     * alphabetic characters are converted to uppercase. Non-alphabetic characters
     * remain unchanged.
     * 
     * @param str The string to be converted to uppercase.
     * @return A new string with all alphabetic characters in uppercase and other
     *         characters unchanged.
     * @example String input = "Hello, World!";
     *          String result = MakeUpperCase(input);
     *          // result will be "HELLO, WORLD!".
     * @example String input = "123abc";
     *          String result = MakeUpperCase(input);
     *          // result will be "123ABC".
     * @example String input = "";
     *          String result = MakeUpperCase(input);
     *          // result will be an empty string "".
     */
    public static String MakeUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                if (c >= 'a' && c <= 'z') {
                    chars[i] = (char) (c - 'a' + 'A');
                }

            }

        }
        return new String(chars);
    }

    /**
     * Reverses the input string.
     *
     * This method takes a string as input and returns a new string containing the
     * characters of the input string
     * in reverse order.
     *
     * @param str The input string to be reversed.
     * @return A new string with the characters of the input string in reverse
     *         order.
     * @throws NullPointerException If the input string is null.
     *
     * @implNote This method uses a StringBuilder to efficiently concatenate the
     *           characters in reverse order,
     *           resulting in a linear time complexity with respect to the length of
     *           the input string.
     *
     * @implSpec The implementation of this method ensures that the original input
     *           string is not modified.
     *           The returned string is a new object with the reversed characters.
     *
     * @see StringBuilder
     */
    public static String solution(String str) {
        StringBuilder a = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            a.append(str.charAt(i));
        }
        return a.toString();
    }

    /**
     * Adds line numbers to each element in the input list of strings.
     *
     * This method takes a list of strings as input and returns a new list with line
     * numbers
     * added to each element. The line numbers are formatted as "<lineNumber>:
     * <originalString>".
     * The line numbers start from 1 and increment for each element in the input
     * list.
     *
     * @param lines The input list of strings to which line numbers will be added.
     * @return A new list of strings with line numbers added to each element.
     * @throws NullPointerException If the input list or any of its elements is
     *                              null.
     *
     * @implNote This method iterates through the input list using an enhanced for
     *           loop (for-each loop)
     *           and constructs a new list with line numbers using a StringBuilder
     *           to efficiently
     *           concatenate the formatted strings. It ensures that the original
     *           input list is not modified.
     *
     * @implSpec The implementation of this method guarantees that the returned list
     *           will have the same
     *           number of elements as the input list, and the order of elements
     *           will be preserved.
     *
     * @see ArrayList
     * @see StringBuilder
     */
    public static List<String> number(List<String> lines) {
        List<String> numberedLines = new ArrayList<>(lines.size());
        int lineNumber = 0;
        for (String line : lines) {
            String numberedLine = ++lineNumber + ": " + line;
            numberedLines.add(numberedLine);
        }
        return numberedLines;
    }

    /**
     * Converts a string into camel case by inserting a space before each uppercase
     * letter.
     *
     * @param input The input string to be converted to camel case.
     * @return A new string in camel case format with spaces inserted before
     *         uppercase letters.
     */
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
    /**
     * Checks if the URL is encripted or not
     * @param input The input is the url
     * @return the url is safe or the url is not safe or the url has invalid format
     */
    public static String safeUrl(String input){
        if(input.startsWith("www."))
         return "Invalid URL";
        return input.startsWith("https://") ? "URL is safe" : "URL is not safe";
    }

}