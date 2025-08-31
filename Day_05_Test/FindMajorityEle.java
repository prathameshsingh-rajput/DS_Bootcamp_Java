/* Write a program in C to find the majority element of an array ?
A majority element in an array A[] of size n is an element that appears more than n/2 times
(and hence there is at most one such element).
For example,
Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
*/

import  java.util.Scanner;

public class FindMajorityEle{
	public static void sort(int arr[]){
		for(int i = 0; i < arr.length; ++i){
			for(int j = 0; j < arr.length - 1 - i; ++j){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
    public static void main(String[] args) {
		int arr[];
		Scanner in = new Scanner(System.in);

		System.out.print("Enter size of an Array: ");
	    arr = new int[in.nextInt()];

		System.out.print("Enter "+arr.length+" elements: ");
		for(int i = 0; i < arr.length; ++i){
			arr[i] = in.nextInt();
		}

		sort(arr);

		if(arr[0] == arr[arr.length / 2]){
			System.out.println("Majority Element is : "+arr[0]);
		}else{
			System.out.println("There is no Majority Element.");
		}


        in.close();
    }
}