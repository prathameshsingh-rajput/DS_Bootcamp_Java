// 8) Write a program to merge two arrays of same size and sort in decending order.

import java.util.Scanner;

public class MergeAndSort{
	public int [] merge(int arr1[], int arr2[]){
		int arr[] = new int[2*arr1.length];

		int j = 0, i = 0;
		while(i < arr.length){
			arr[i++] = arr1[j];
			arr[i++] = arr2[j++];
		}

		return arr;
	}
	public void mergeAndSort(int []arr1, int [] arr2){
		int arr[] = merge(arr1, arr2);

		for(int i = 0; i < arr.length; ++i){
			for(int j = 0; j < arr.length-i-1; ++j){
				int temp = arr[j+1];
				if(arr[j] < arr[j+1]){
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Decending order merged array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		MergeAndSort obj = new MergeAndSort();

		int arr1[] = new int[5];
		int arr2[] = new int[5];

		System.out.print("Enter 5 elements for arr1: ");
		for(int i = 0; i < 5; i++){
			arr1[i] = in.nextInt();
		}

		System.out.print("Enter 5 elements for arr2: ");
		for(int i = 0; i < 5; i++){
			arr2[i] = in.nextInt();
		}

		obj.mergeAndSort(arr1, arr2);
	}
}
