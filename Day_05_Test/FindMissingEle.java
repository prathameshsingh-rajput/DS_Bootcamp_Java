/*
 Write a program to enter the 5 values in ascending order and store in array and find out
the missing element from array?
a[0]                                a[1]                        a[2]                              a[3]                         a[4]
1 5 9 13 17

Missing elements : output should like as
2 3 4 6 7 8 10 11 12 14 15 16
*/

import java.util.Scanner;

public class FindMissingEle{
    public static void main(String[] args) {
        int arr[];
        Scanner in = new Scanner(System.in);

		System.out.print("Enter size of an Array: ");
		arr = new int[in.nextInt()];

		System.out.print("Enter "+arr.length+" elements: ");
		for(int i = 0; i < arr.length; ++i){
			arr[i] = in.nextInt();
		}

		int val;
		for(int i = 0; i < arr.length-1; ++i){
			val = ++arr[i];
			while(val < arr[i+1]){
				System.out.print(val + " ");
				val++;
			}
		}
        in.close();
		System.out.println();
    }

}