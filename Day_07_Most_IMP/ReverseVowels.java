/*
Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"
*/

import java.util.Scanner;

class ReverseVowels {
    public String reverseVowels(String s) {
        if(s == null ||s.length() <= 1) return s;

        int left = 0, right = s.length() -1;
        String vowels = "aeiouAEIOU";
        char ch [] = s.toCharArray();

        while(left < right){
            char lChar = ch[left];
            char rChar = ch[right];

            if(vowels.indexOf(lChar) != -1){
                if(vowels.indexOf(rChar) != -1){
                    ch[left++]  = rChar;
                    ch[right--] = lChar;
                }else{
                    right--;
                }
            }else{
                left++;
            }
        }

        return new String(ch);
    }

    public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		ReverseVowels obj = new ReverseVowels();

		String s = in.next();

		System.out.println(obj.reverseVowels(s));
	}
}