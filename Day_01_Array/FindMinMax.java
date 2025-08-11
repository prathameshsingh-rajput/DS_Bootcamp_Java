// Q.2)	WAP to enter the five elements in array and find out the maximum and minimum elements a[0]
import java.util.Scanner;

public class FindMinMax{
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.print("Enter 5 elements: ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < 5; i++){
			arr[i] = in.nextInt();
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}

		System.out.println("Max in array: "+max+"\nMin in array: "+min);
	}

}