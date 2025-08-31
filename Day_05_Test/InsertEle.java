/*
 WAP to insert the element on specified position in array  ?
e.g. declare the array of size 6 and store 5 values in it  and last block should be empty
     a[0]                         a[1]                     a[2]                   a[3]              a[4]                 a[5]
10 20 30 40 50
Enter the index on which value want to be insert
e.g.    index    = 2
Enter the value which want to store on index
Value =  100
When we insert the value on index then we need to shift the values from index to next index
e.g.
 a[0]                         a[1]                    a[2]                       a[3]                 a[4]
10 20 100 30 40 50
*/

import java.util.Scanner;

public class InsertEle{
	public static void print(int arr[]){
		for(int x: arr){
			System.out.print(x+" ");
		}
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int idx, val;
        System.err.println("Enter the element and index where you want to insert: ");
        val = in.nextInt();
        idx = in.nextInt();

		for(int i = arr.length-1; i > idx; --i){
			arr[i] = arr[i-1];
		}
		arr[idx] = val;

       print(arr);
       in.close();





    }
}