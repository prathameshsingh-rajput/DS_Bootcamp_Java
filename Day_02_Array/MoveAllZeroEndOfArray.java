// Q.16) Write a program in C to move all zeroes to the end of a given array.

import java.util.Scanner;

public class MoveAllZeroEndOfArray{
	public int[] moveZeroToEOA(int []arr){
		int idx = 0;
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] != 0){
				arr[idx++] = arr[i];
			}
		}
		for(int i = idx; i < arr.length; ++i){
			arr[i] = 0;
		}

		return arr;
	}

	public void print(int []arr){
		System.out.print("\nResulting Array: ");
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		MoveAllZeroEndOfArray obj = new MoveAllZeroEndOfArray();

		int arr[] = new int[10];
		System.out.print("Enter 10 elements: ");
		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt();
		}

		obj.print(obj.moveZeroToEOA(arr));

		System.out.println();
		in.close();

	}
}