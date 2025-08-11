//Q.4)	WAP to insert the element on specified position in array.


import java.util.Scanner;

public class InsertInArray{
	public void insertElement(int []arr, int idx, int ele){
		if(idx < 0 || idx >= arr.length){
			System.out.println("Invalid Index Entered..");
			return;
		}

		int temp = arr[idx];
			arr[idx] = ele;
		for(int i = idx+1; i < arr.length; ++i){
			int temp2 = arr[i];
			arr[i] = temp;
			temp = temp2;
		}

		System.out.println();
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		InsertInArray obj = new InsertInArray();

		int arr[] = new int[6];

		System.out.print("Enter 5 elements: ");

		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
		}

		System.out.print("Enter index where you want to insert elements: ");
		int idx = in.nextInt();
		System.out.print("Enter a element: ");
		int ele = in.nextInt();

		obj.insertElement(arr, idx, ele);
	}

}