/*
Removing Duplicates from a String
This problem involves taking an input string and producing a new string where all duplicate characters are removed,
typically preserving the original order of first occurrences. For example, given the string "programming",
the output should be "progamin" because duplicates like the second 'r', 'm', etc., are eliminated.
This is useful in scenarios like data cleaning or generating unique character sets.

Example:

Input: "hello world"

Output: "helo wrd" (removes duplicate 'l', 'o' in "hello", and spaces are treated as characters;
if spaces should be ignored, the logic canbeadjusted)
*/

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicates
{	public static String removeDuplicates(String str)
	{
		if(str == null || str.length() <= 1) return str;

		Set<Character> set = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();

		char ch[] = str.toCharArray();

		for(char c : ch)
		{
			set.add(c);
		}

		for(char c : set)
		{
			sb.append(c);
		}

		return sb.toString();
	}

	public static String removeDuplicatesLower(String str)
	{
		if(str == null || str.length() <= 1) return str;

		char ch[] = new char[26];

		char result[] = str.toCharArray();
		int ptr = 0;

		for(char c : result)
		{
			if(c == ' ')
			{
				result[ptr++] = c;
			}else if(ch[c-'a'] == 0)
			{
				result[ptr++] = c;
				ch[c-'a']++;
			}
		}

		return new String(result, 0, ptr);
	}
	public static void main(String[]a)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println(removeDuplicatesLower(str));

		String str2 = in.nextLine();
		System.out.println(removeDuplicates(str2));
	}
}