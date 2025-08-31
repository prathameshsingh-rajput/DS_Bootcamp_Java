import java.util.Scanner;

public class MoveHashes{
	public static String moveHashes(String str){
		if(str == null || str.length() <= 1) return str;

		char ch[] = str.toCharArray();

		int ptr = str.length()-1;

		for(int i = str.length() -1; i >= 0; --i){
			if(ch[i] != '#'){
				ch[ptr--] = ch[i];
			}
		}

		for(int i = ptr; i >= 0; --i){
			ch[i] = '#';
		}

		return new String(ch);
	}
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		String str = in.next();

		System.out.println(moveHashes(str));
	}
}