// 9)Write a program in C to separate odd and even integers in separate arrays.
import java.util.Scanner;

public class SeparateEvenOdd{
	public void separateEvenOdd(int []arr){
		int even[] = new int[arr.length];
		int odd[]  = new int[arr.length];

		int e = 0, d = 0;
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] % 2 == 0){
				even[e++] = arr[i];
			}else{
				odd[d++] = arr[i];
			}
		}

		System.out.print("\nEven Elements in arr: ");
		for(int i = 0; i < e; i++){
			System.out.print(even[i]+" ");
		}

		System.out.print("\nOdd Elements in arr: ");
			for(int i = 0; i < d; i++){
				System.out.print(odd[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[]a){
			Scanner in = new Scanner(System.in);
			SeparateEvenOdd obj = new SeparateEvenOdd();

			int arr[] = new int[10];

			System.out.print("Enter 10 elements: ");

			for(int i = 0; i < 10; i++){
				arr[i] = in.nextInt();
			}

			obj.separateEvenOdd(arr);
		}
}
