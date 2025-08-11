//Q.11).Write a program in to find the second largest element in an array.

import java.util.Scanner;

public class Find2ndLargestEle{
	public int find2ndLargest(int []arr){
		int largest = arr[0];
		int secondLargest = -1;

		for(int i = 1; i < arr.length; ++i){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i] != largest){
				secondLargest = arr[i];
			}
		}
		return secondLargest;

	}

	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		Find2ndLargestEle obj = new Find2ndLargestEle();

		int arr[] = new int[10];

		System.out.print("Enter 10 elements: ");

		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt();
		}
		System.out.println("Secound Largest Element: "+obj.find2ndLargest(arr));
	}
}







