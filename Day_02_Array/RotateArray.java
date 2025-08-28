// Q.18) Write a program in C to rotate an array by N positions.

import java.util.Scanner;

public class RotateArray{
	public int[] rotateArray(int []arr, int key){
		if(key > arr.length) key = arr.length % key;

		int rotate[] = new int[key];

		for(int i = 0; i < key; ++i){
			rotate[i] = arr[i];
		}

		for(int i = key; i < arr.length; ++i){
			arr[i-key] = arr[i];
		}

		int idx = 0;
		for(int i = arr.length - key; i < arr.length; ++i){
			arr[i] = rotate[idx++];
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
		RotateArray obj = new RotateArray();

		int arr[] = new int[10];
		System.out.print("Enter 10 elements: ");
		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt();
		}

		System.out.print("Enter a key element to rotate: ");
		int key = in.nextInt();

		obj.print(obj.rotateArray(arr, key));

		System.out.println();
		in.close();

	}
}
