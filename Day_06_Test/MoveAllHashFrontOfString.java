/*
Questions 4 Problem Statement –
You have write a function that accepts, a string which length is “len”, the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.
example :-
Sample Test Case
Input:
Move#Hash#to#Front
Output:
###MoveHashtoFront

*/

public class MoveAllHashFrontOfString{
	public String moveHashFront(String str){
		int hash = 0;

		for(int i = 0; i < str.length(); ++i){
			char ch = str.charAt(i);
			if(ch == '#'){
				hash++;
			}else{
				sb.append(ch);
			}
		}
	}
	public static void main(String[]a)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter an String ");
		String str = in.next();


	}
}