//Q. 12). Write a java program to find the second smallest element in an array

import java.util.Scanner;
public class Find2ndSmallest{
	public int get2ndSmallEle(int []arr){
		int smallest = arr[0], secondSmallest = -1;

		for(int i = 1; i < arr.length; ++i){
			if(arr[i] < smallest){
				secondSmallest = smallest;
				smallest = arr[i];
			}else if(arr[i] < secondSmallest && arr[i] != smallest){
				secondSmallest = arr[i];
			}
		}

		return secondSmallest;

	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		Find2ndSmallest obj = new Find2ndSmallest();

		int arr[] = new int[5];
		System.out.print("Enter 5 elements: ");
		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}

		System.out.print("\nSecond Smallest Element in array : "+obj.get2ndSmallEle(arr));
		System.out.println();
	}
}