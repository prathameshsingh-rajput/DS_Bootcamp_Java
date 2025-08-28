// Q. 15)  Write a program in C to find the smallest missing element from a sorted array.

import java.util.Scanner;

public class SmallestMissingEle{
	public int getSmallestMissing(int []arr){
		int start = ++arr[0];
		for(int i = 1; i < arr.length; ++i){
			if(arr[i] == start){
				start++;
			}else{
				return start;
			}
		}
		return start;
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		SmallestMissingEle obj = new SmallestMissingEle();

		int arr[] = new int[5];
		System.out.print("Enter 5 elements: ");
		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}

		System.out.print("\nSmallest Missing Element In Above Array : "+obj.getSmallestMissing(arr));
		System.out.println();
		in.close();

	}
}