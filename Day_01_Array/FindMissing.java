//5). Write a program to enter the 5 values in ascending order and store in array and find out the missing element from array.

import java.util.Scanner;

public class FindMissing{
	public void printMissing(int []arr){
			int start = arr[0]+1;

			for(int i = 1; i < arr.length; ++i){
				while(start < arr[i]){
					System.out.print(start+++" ");
				}
				start++;
			}
			System.out.println();
		}
		public static void main(String[]a){
			Scanner in = new Scanner(System.in);
			FindMissing obj = new FindMissing();

			int arr[] = new int[5];

			System.out.print("Enter 5 elements: ");

			for(int i = 0; i < 5; i++){
				arr[i] = in.nextInt();
			}

			obj.printMissing(arr);
		}

}