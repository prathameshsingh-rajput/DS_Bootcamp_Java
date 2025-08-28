// Q.13) . Write a program in java to find a pair with given sum in the array.

import java.util.Scanner;

public class FindSumPair{
	public int[] findPairSum(int []arr, int keySum){
		int result[] = new int[2];
		boolean found = false;
		for(int i = 0; i < arr.length -1; ++i){
			for(int j = i+1; j < arr.length; ++j){
				if(arr[i] + arr[j] == keySum){
					result[0] = i;
					result[1] = j;
					found = true;
					break;
				}
			}
		}

		return found ? result : null;

	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		FindSumPair obj = new FindSumPair();

		int arr[] = new int[5];
		System.out.print("Enter 5 elements: ");
		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}
		System.out.print("Enter a number: ");
		int keySum = in.nextInt();

		int result[] = obj.findPairSum(arr, keySum);
		if(result == null){
			System.out.println("Pair for give sum not exists..");
		}else{
			System.out.println("["+result[0]+","+result[1]+"] is the pair index.");
		}
		System.out.println();
	}
}