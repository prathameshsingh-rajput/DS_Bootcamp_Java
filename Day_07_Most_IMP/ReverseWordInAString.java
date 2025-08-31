/*
Reverse Words in a String

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/

import java.util.Scanner;

class ReverseWordInAString {
    public String reverseWords(String s) {
        if (s == null) return "";
        s = s.trim();
        if (s.length() <= 1) return s;

        String[] words = s.split("\\s+");  // handles multiple spaces
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; --i) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        ReverseWordInAString obj = new ReverseWordInAString();
        String result = obj.reverseWords(input);

        System.out.println("\nReversed words: " + result);
        sc.close();
    }
}
