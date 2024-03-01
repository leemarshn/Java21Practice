package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ReverseWordPure {
    public static String reverseWords(String s) {
        // Remove leading and trailing spaces
        s = s.trim();

        // Split the string into words using the String.split() method
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i= words.length-1; i>=0; i--){
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String input = "the sky is blue";
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output: "blue is sky the"
    }
}
