import java.util.Scanner;

public class ReverseAnArray{
	public static int [] reverse(int []arr){
		int l = 0, r = arr.length - 1;

		while(l < r){
			int temp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = temp;
		}

		return arr;
	}

	public static void print(int arr[]){
		for(int i = 0; i < arr.length;++i){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int arr[] = new int[size];
	
		for(int i = 0; i < size; ++i)
			arr[i] = in.nextInt();

		arr = reverse(arr);
		print(arr);
		
		in.close();
			
	}
}