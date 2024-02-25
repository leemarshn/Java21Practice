package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordString {

    public static String reverseWords(String s) {
        // Remove leading and trailing spaces
        s = s.trim();

        // Split the string into words using the String.split() method
        String[] words = s.split("\\s+");

        // Reverse the array using the Collections.reverse() method from Java 21
        List<String> wordsList = Arrays.asList(words);
        Collections.reverse(wordsList);

        // Join the reversed words back into a string using the String.join() method from Java 21
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String input = "the sky is blue";
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output: "blue is sky the"
    }
}
