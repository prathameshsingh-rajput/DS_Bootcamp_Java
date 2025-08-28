/*Q3. Reverse a String using Stack
   Write a program to reverse a given string using a stack.
*/

import java.util.Stack;
import java.util.Scanner;

public class ReverseStrByStack{
	public String reverseStr(String str){
		if(str == null || str.length() <= 1) return str;

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length(); ++i){
			stack.push(str.charAt(i));
		}


		for(int i = 0; i < stack.size(); ++i){
			sb.append(stack.pop());
		}

		return sb.toString();
	}
	public static void main(String []a){
		Scanner in = new Scanner(System.in);
		ReverseStrByStack obj = new ReverseStrByStack();

		System.out.print("Enter a string: ");
		String str = in.next();

		System.out.println("Reverse of '"+str+"' :-> "+obj.reverseStr(str));
		in.close();
	}
}