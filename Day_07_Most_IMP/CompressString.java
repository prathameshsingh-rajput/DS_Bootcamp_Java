/*
Compress a string by replacing consecutive repeated characters with character + count (e.g., "aabbbbeeeeffggg"->"a2b4e4f2g3"
*/

import java.util.Scanner;

public class CompressString{
	public static String compressString(String str)
	{
		if(str == null || str.length() <= 1) return str;

		char []ch = str.toCharArray();

		int ptr = 0;
		int count = 0;

		for(char c : ch){
			if(count == 0)
			{
				ch[ptr++] = c;
				count++;
			}else if(ch[ptr-1] == c)
			{
				count++;
			}else
			{
				for( char cc : String.valueOf(count).toCharArray()){
					if(count > 1)
						ch[ptr++] = cc;
				}

				ch[ptr++] = c;
				count = 1;
			}
		}

		if(count > 1 && ptr < ch.length)
		{
			for(char cc : String.valueOf(count).toCharArray())
			ch[ptr++] = cc;
		}

		return new String(ch, 0, ptr);
	}
	public static void main(String[]a)
	{
		CompressString obj = new CompressString();
		Scanner in = new Scanner(System.in);
		String input = in.next();

		System.out.println("\n"+input+" string's compressed version: "+obj.compressString(input));
	}

}