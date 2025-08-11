// Q1. WAP to enter the five elements in array and show it

import java.util.Scanner;

public class CreateAndShowArray{
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.print("Enter 5 elements: ");
		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}
		System.out.print("\nElements in array: ");
		for(int i = 0; i < 5; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}