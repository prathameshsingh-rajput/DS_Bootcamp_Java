// Write a program in Java to delete an element at desired position from an array.

import java.util.Scanner;

public class DeleteEleFromArr{
	public static void print(int arr[]){
		for(int i = 0; i < arr.length-1; ++i){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[]a){
        int arr[];
		Scanner in = new Scanner(System.in);

		System.out.print("Enter size of an Array: ");
	    arr = new int[in.nextInt()];

		System.out.print("Enter "+arr.length+" elements: ");
		for(int i = 0; i < arr.length; ++i){
			arr[i] = in.nextInt();
		}

		System.out.print("Enter the index: ");
	    int idx = in.nextInt();

	    for(int i = idx; i < arr.length-1; ++i){
			arr[i] = arr[i+1];
		}

		print(arr);

	}
}