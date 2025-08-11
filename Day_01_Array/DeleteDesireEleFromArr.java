// Q.10).	Write a program in C to delete an element at desired position from an array.

import java.util.Scanner;

public class DeleteDesireEleFromArr{
	public void deleteEle(int arr[], int idx){
		if(idx < 0 || idx >= arr.length){
			System.out.println("Invalid Index Entered..");
			return;
		}

		for(int i = idx; i < arr.length-1; ++i){
			arr[i] = arr[i+1];
		}

		System.out.print("Array After delete element: ");
		for(int i = 0; i < arr.length-1; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		DeleteDesireEleFromArr obj = new DeleteDesireEleFromArr();

		int arr[] = new int[5];

		System.out.print("Enter 5 elements: ");

		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}

		System.out.print("Enter a index :");
		int idx = in.nextInt();
		obj.deleteEle(arr, idx);
	}
}
