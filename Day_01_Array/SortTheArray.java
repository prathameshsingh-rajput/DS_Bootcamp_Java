//Q.3)	WAP to enter the five element and display in ascending order.


import java.util.Scanner;

public class SortTheArray{
	public int [] sortArray(int []arr){
		for(int i = 0; i < arr.length; ++i){
			for(int j = 0; j < arr.length-i-1; ++j){
				int temp = arr[j+1];
				if(arr[j] > arr[j+1]){
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		SortTheArray obj = new SortTheArray();

		int arr[] = new int[5];

		System.out.print("Enter 5 elements: ");

		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}

		arr = obj.sortArray(arr);
		for(int i = 0; i < 5; i++){
			System.out.print(arr[i] + " ");
		}
	}

}