import java.util.Scanner;

public class LargestSmallest{
	public static void getSmallestLargest(int arr[]){
		if(arr == null || arr.length <= 1){
			 System.out.println("Array must have to contain at least 2 element.."); 
			return;
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int a : arr){
			if(a < min) min = a;
			if(a > max) max = a;
		}
			
		if(min == max) System.out.println("All the elements in array are same..("+min+")");
		else System.out.println("Max element: "+max+"\nMin element: "+min);
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];

		for(int i =0; i < N; ++i){
			arr[i] = in.nextInt();
		}

		getSmallestLargest(arr);
	}
}