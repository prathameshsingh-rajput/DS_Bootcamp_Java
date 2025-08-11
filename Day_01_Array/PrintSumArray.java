//Q.1.2)	WAP to enter the five elements in array and calculate the sum of all elements

import java.util.Scanner;

public class PrintSumArray{
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;

		System.out.print("Enter 5 elements: ");
		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
			sum+= arr[i];
		}
		System.out.print("Sum of all elements in array: "+sum);
		System.out.println();
	}

}