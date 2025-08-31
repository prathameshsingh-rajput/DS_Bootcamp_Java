/*
Write a program in C to rotate an array by N positions ?
Expected Output :
The given array is : 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are : 12 14 18 20 22 25 27
Before 4th position the values of the array are : 0 3 6 9
After rotating from 4th position the array is:
12 14 18 20 22 25 27 0 3 6 9
*/

import java.util.Scanner;

public class RotateArray{
    public static void print(int arr[]){
		for(int x: arr){
			System.out.print(x+" ");
		}
	}
    public static void rotate(int []arr, int pos){

        int temp[] = new int[pos];

        for(int i = 0; i < pos; ++i){
			temp[i] = arr[i];
		}
		print(temp);
		System.out.println();

		for(int i = pos; i < arr.length; ++i){
			arr[i-pos] = arr[i];
		}
		int idx = 0;
		for(int i = arr.length - pos; i < arr.length; ++i){
			arr[i] = temp[idx++];
		}

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of an Array: ");
        int n = in.nextInt();
        int arr[] = new int[n];

		System.out.println("Enter "+n+" elements: ");
        for(int i = 0; i < n; ++i){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter position from where you want to rotate: ");
        int pos = in.nextInt();

        rotate(arr, pos);
        print(arr);

    }

}