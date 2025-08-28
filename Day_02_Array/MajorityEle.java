// Q.14) Write a program in Java to find the majority element of an array.

import java.util.Scanner;

public class MajorityEle{
	public int getMajorEle(int []arr){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 1; j < arr.length-i; ++j){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}

		return arr[arr.length/2];
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		MajorityEle obj = new MajorityEle();

		int arr[] = new int[10];
		System.out.print("Enter 10 elements: ");
		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt();
		}

		System.out.print("\nMajority Element In Above Array : "+obj.getMajorEle(arr));
		System.out.println();
		in.close();

	}
}