/*
Questions 1 Problem Statement – Bela teaches her daughter to find the factors of a given number.
When she provides a number to her daughter, she should tell the factors of that number.
Help her to do this, by writing a program. Write a class FindFactor.java and write the main method in it.
Note :
•	If the input provided is negative, ignore the sign and provide the output. If the input is zero
•	If the input is zero the output should be “No Factors”.

*/
import java.util.Scanner;

public class FindFactor{
	public void calculateFactor(int num){
		for(int i = 1; i <= num; ++i){
			if(num % i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();x
	}
	public static void main(String []a){
		Scanner in = new Scanner(System.in);
		FindFactor obj = new FindFactor();

		System.out.print("Enter a number: ");
		int num = in.nextInt();

		if(num != 0){
			obj.calculateFactor(Math.abs(num));
		}else{
			System.out.println("No Factor");
		}
	}
}