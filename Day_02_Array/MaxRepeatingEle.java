// Q.17) 27) Write a program in Java to find the maximum repeating number in a given array.

public class MaxRepeatingEle{
	public int maxRepeatingEle(int []arr){

	}

	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		MaxRepeatingEle obj = new MaxRepeatingEle();

		int arr[] = new int[10];
		System.out.print("Enter 10 elements: ");
		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt();
		}

		System.out.println("Max. repeating element in array: "+obj.maxRepeatingEle(arr));

		System.out.println();
		in.close();

	}
}
