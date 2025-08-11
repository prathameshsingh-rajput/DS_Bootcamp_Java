// Q.6).WAP to enter the five element in array and reverse it.

import java.util.Scanner;

public class ReverseArray{
	public void reverseArr(int []arr){
		int i = 0, n = arr.length - 1;
		while(i < n){
			int temp = arr[i];
			arr[i++] = arr[n];
			arr[n--] = temp;
		}

		for(i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		ReverseArray obj = new ReverseArray();

		int arr[] = new int[5];

		System.out.print("Enter 5 elements: ");

		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}

		obj.reverseArr(arr);
	}
}