// Q. 7)WAP to enter the 10 element array and print the occurrence of every element.

import java.util.Scanner;
public class OccurrenceOfElements{
	public void printOccurrence(int []arr){
		boolean []visited = new boolean[arr.length];

		for(int i = 0; i < arr.length; ++i){
			if(!visited[i]){
				int count = 1;
				for(int j = i+1; j < arr.length; ++j){
					if(arr[i] == arr[j]){
						count++;
						visited[j] = true;
					}
				}
				visited[i] = true;
				System.out.println("Element "+arr[i]+" occurred "+count+" times");
			}
		}

	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		OccurrenceOfElements obj = new OccurrenceOfElements();

		int arr[] = new int[10];

		System.out.print("Enter 10 elements: ");

		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt();
		}
		obj.printOccurrence(arr);
	}
}