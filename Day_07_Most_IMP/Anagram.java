/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
*/
import java.util.Scanner;

public class Anagram{
	public static boolean isAnagram(String str1, String str2){
		if(str1 == null || str2 == null) return false;
		if(str1.length() != str2.length()) return false;

		int count[] = new int[26];

		for(int i = 0; i < str1.length(); ++i){
			count[str1.charAt(i)-'a']++;
			count[str2.charAt(i)-'a']--;
		}

		for(int i = 0; i < count.length; ++i){
			if(count[i] != 0) return false;
		}

		return true;
	}

	public static void main(String[]a){

		Scanner in = new Scanner(System.in);
				String str1 = in.next();
				String str2 = in.next();

		System.out.println("\n"+str1+" and "+str2+" is anagram string: "+isAnagram(str1, str2));
	}
}